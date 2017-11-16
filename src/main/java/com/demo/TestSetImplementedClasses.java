package com.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetImplementedClasses {
	public static void main(String[] args) {
		//Collection works only with objects
	
		/**
		 * Generics -
		 * 		To provide compile time safety
		 * 		so ultimately to avoid runtime classclastException
		 * ? --nothing -- it accepts all objects -- NO bound
		 * ? extends Number -- it accepts all objects of type number or number obj itself-- Upper bound
		 * ? super Number -- it accepts number object and it's parent-- Lower bound
		 * 
		 * 
		 * Stud --member fields -- parameterized constructor --getter/setter -- toStringmethod
		 * Prof --member fields -- parameterized constructor --getter/setter -- toStringmethod
		 * 
		 * 
		 */
		
		Stud s1 = null;//new Stud("S1", 101, 80); //Content
		Stud s3 = null;//new Stud("S3", 101, 82); //Contents 
		
		Set <Stud>setOfStud= new HashSet(); //user definer type
		
		System.out.println(setOfStud.add(s3));//3
		System.out.println(setOfStud.add(s1));//3
		
		System.out.println("Size of Stud set -- "+setOfStud.size());
		
		Iterator<Stud> itr = setOfStud.iterator();
		while(itr.hasNext()){
			Stud s= itr.next();
			//System.out.println(s.getsName());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

class Stud{
	private int sid;

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stud other = (Stud) obj;
		if (sid != other.sid)
			return false;
		return true;
	}

	public Stud(int sid) {
		super();
		this.sid = sid;
	}
	
	
	
}












