import java.util.LinkedHashMap;

public class FrequencyCalculator {

	public static void main(String[] args) {
		String s = "Malayalam";
		s = s.toLowerCase();
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for(char c: s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		System.out.println(hm);
		
	}

}
