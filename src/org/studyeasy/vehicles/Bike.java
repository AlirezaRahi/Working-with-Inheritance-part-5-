package org.studyeasy.vehicles;

import org.studyeasy.parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;

	public Bike() {
		super();
		this.handle="short";
	}

	public Bike(String handle,String engine, int wheels, int seats, int fuleTank, String lights) {
		super(engine,wheels,seats,fuleTank,lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuleTank()=" + getFuleTank() + ", getLights()=" + getLights()
				+ "]";
	}
	
	public void run() {
		
		System.out.println("Runnig bike");
		System.out.println(toString());
		
	}
	
	

}
