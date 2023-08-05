package com.ankita.patel.cadashcollectionframwork;

import java.util.Comparator;

public class SimpleProductComparator implements Comparator<SimpleProduct>{

	@Override
	public int compare(SimpleProduct o1, SimpleProduct o2) {		
		return o1.getLabel().compareTo(o2.getLabel());
	}
	

}
