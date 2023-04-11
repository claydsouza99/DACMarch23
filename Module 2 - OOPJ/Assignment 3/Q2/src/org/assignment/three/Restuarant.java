package org.assignment.three;

public class Restuarant {
	String dish;
	float price;
	
	public Restuarant() {
		this("",0.0f);
	}
	
	public Restuarant(String dish, float price) {
		
		this.dish = dish;
		this.price = price;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	
	public String toString() {
		return String.format("%-10s%-1.2f ", this.dish, this.price)	;
		}
	
	
	}
