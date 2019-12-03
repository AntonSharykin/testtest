package main.java.sharykin.com;

public class SportCamp {
	String name;
	int countDays;
	
	
	public SportCamp() {
		super();
	}
	public SportCamp(String name, int countDays) {
		super();
		this.name = name;
		this.countDays = countDays;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCountDays() {
		return countDays;
	}
	public void setCountDays(int countDays) {
		this.countDays = countDays;
	}

	
}
