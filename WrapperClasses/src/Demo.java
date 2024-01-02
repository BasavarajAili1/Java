
public class Demo {

	public static void main(String[] args) {
		int num1 = 7; // primitive
		Integer num2 = new Integer(8); 
//		System.out.println(num2);
		
		// Every primitive has it's own wrapper class
		Integer num3 = num1; // Auto-boxing -> primitive to object type
		System.out.println(num3);
		
		int num4 = num3; // Auto-unboxing -> object type to primitive
		
		// uses of wrapper classes
		//1. To wrap primitive into object type
		//2. To define several utility methods for primitive. Ex:
		String s = Integer.toString(10);
		System.out.println(s);
		
		String str = "4";
		int num5 = Integer.parseInt(str); // converting string value into int
		System.out.println(num5 * 2);
		

	}

}
