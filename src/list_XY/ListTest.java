package list_XY;

import static org.junit.Assert.*;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListTest {
	
	private List people = new List();
	
	@Before
	public void init()
	{
		this.people.add("Antal");
		this.people.add("Tóni");
		this.people.add("Katalin");
		this.people.add("Eszter");
		this.people.add("Hedvig");
		this.people.add("János");
		this.people.add("Tihamér");	
	}

	@Test
	public void testEmpty() {assertFalse(this.people.isEmpty());}
	
	@Test
	public void testAdd()
	{
		this.people.add("Hedvig");
		assertEquals("Teszt - bekerül-e az új elem?",8,this.people.size());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void removeTest() {this.people.remove("Tihamér");}

	/*
	 public void statustest () {
		fail("status");
		}
	*/
	
	@Test
	public void removeAllTest() 
	{
		this.people.removeAll();
		assertTrue(this.people.isEmpty());
	}
	
	@After
	public void destroy() {this.people.removeAll();}
}
