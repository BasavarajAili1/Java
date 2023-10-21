package com.kodnest.singletonDesignPattern;

public class PrimeMinister {
	static PrimeMinister pm = null;
	String name;
	int age;
	String gender;
	
	public void maintainGoodRelationWithPrimeMinisters() {
		System.out.println("Prime Minister "+name+" is maintaining good relationship with other PMs");
	}
	
	public void takeCareOfCitizens() {
		System.out.println("Prime Minister "+name+" is taking care of cigizens of country");
	}
	
	public void attendMeetings() {
		System.out.println("Prime Minister "+name+" is attending meetings with Chief Ministers");
	}
	
	private PrimeMinister(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static PrimeMinister getInstance() {
		if (pm == null) {
			pm = new PrimeMinister("Modi", 74, "Male");
		}
		return pm;
	}

}
