package org.assignment.five.domain;

import java.util.Comparator;

public class PriceComparator implements Comparator<MenuItem> {

	@Override
	public int compare(MenuItem o1, MenuItem o2) {	
	return (int) (o1.getPrice() - o2.getPrice());

}
}
