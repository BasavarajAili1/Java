package practiceHere;

public class Main1 {

	

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = t1;
		t2.x = 20;
		System.out.println(t1.x);

	}

}
