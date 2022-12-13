package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistPrgm
{

	public static void main(String[] args) 
	{
		
		//methods---------->add(),clone(),clear(),equals(),isEmpty(),get(),indexOf(),remove(),contains(),set(),size()
		ArrayList<Object> al = new ArrayList<>();
		al.add("sayali");
		al.add(45);
		al.add(null);
		al.add(77.90);
		al.add("sayali");
		al.add('A');
		System.out.println(al);
		Object a2 = al.clone();
		System.out.println(a2);
		System.out.println(al.equals(a2));
		
		System.out.println(al.isEmpty());	
	
		System.out.println(al.get(0));
		
		System.out.println(al.lastIndexOf("sayali"));
		
		System.out.println(al.size());
		

		System.out.println(al.set(2, "Mandarani"));
		System.out.println(al);
		
		System.out.println("======================================For Loop=======================================");
		
		for(int i=0;i<=al.size()-1;i++)
		{
		   System.out.println(al.get(i));
		}
		
		System.out.println("======================================For each=======================================");
		for(Object neww:al)
		{
			System.out.println(neww);
		}
		System.out.println("======================================Iterator=======================================");
		
		 Iterator<Object> itr = al.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("======================================List Iterator=======================================");
		 
		 ListIterator<Object> li = al.listIterator();
		 while(li.hasNext())
		 {
			 System.out.println(li.next());
		 }
	}

}
