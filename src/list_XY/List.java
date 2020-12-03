package list_XY;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class List {
	
	private ArrayList<String> people;
	
	public List() {this.people = new ArrayList<String>();}

	public void add(String person) {this.people.add(person);} 
	
	public void remove(String person)
	{
		int index = this.people.indexOf(person);
		
		if(index == -1) throw new NoSuchElementException();
		
		this.people.remove(index);
	}
	
	public int size() {return this.people.size();}
	
	public boolean isEmpty() {return this.people.isEmpty();}
	
	public void removeAll() {this.people.removeAll(people);}

	
}