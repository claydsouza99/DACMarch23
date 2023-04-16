package org.assignment.five.domain;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class MenuItem implements Comparator<MenuItem> {
	
private String name;
private double price;
private int calories;

@Override
public int compare(MenuItem o1, MenuItem o2) {
//	return o1.getCalories() - o2.getCalories();
	return (int) (o1.getPrice() - o2.getPrice());
}

@Override
public String toString() {
	return String.format("%-20s%-10.2f%-10d", this.name, this.price, this.calories);
}


}
