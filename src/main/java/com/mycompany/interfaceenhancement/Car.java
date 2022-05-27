package com.mycompany.interfaceenhancement;

public class Car implements Vehicle7 {

	public void getDetails() {
		Car c = new Car();
		c.show();
		c.showNew();
		
		Bus b = new Bus();
		b.show();
		b.showNew();
		
		
	}

	public Double milege() {
		return null;
	}

	@Override
	public void show() {
		
	}
}