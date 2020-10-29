package picker;

import java.util.*;

public class character {
	

	
	String name = "";
	String type = "";
	ArrayList<String> Good;
	ArrayList<String> Bad;
	ArrayList<String> Awful;
	ArrayList<String> Synergies;
	int Number;
	
	public character() {
		name = "";
		type = "";
		
	}
	
	public character(String name, String type, ArrayList<String> good, ArrayList<String> bad, ArrayList<String> awful,
			ArrayList<String> synergies, int number) {
		super();
		this.name = name;
		this.type = type;
		Good = good;
		Bad = bad;
		Awful = awful;
		Synergies = synergies;
		Number = number;
	}
	public character(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public character(int number) {
		super();
		this.Number = number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getGood() {
		return Good;
	}
	public void setGood(ArrayList<String> good) {
		Good = good;
	}
	public ArrayList<String> getBad() {
		return Bad;
	}
	public void setBad(ArrayList<String> bad) {
		Bad = bad;
	}
	public ArrayList<String> getAwful() {
		return Awful;
	}
	public void setAwful(ArrayList<String> awful) {
		Awful = awful;
	}
	public ArrayList<String> getSynergies() {
		return Synergies;
	}
	public void setSynergies(ArrayList<String> synergies) {
		Synergies = synergies;
	}
	public Integer getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		this.Number = number;
	}
	
	
	
	public void print() {
		System.out.println(name+ ": "+type);
	}
	
	public int evaluate(String choiceName) {
		
		int val = 0;
		
		if (Good.contains(choiceName)) {
			val = -3;
		}
		else if (Bad.contains(choiceName)) {
			val = 1;
		}
		else if (Awful.contains(choiceName)) {
			val = 3;
		}
		
		return val;
	}
	

}
