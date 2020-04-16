package test10;

public class Car {
	private String model;
	public Car(String model) {
		this.model=model;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Car)
			return model.equals(((Car) o).model);
		else 
			return false;
		
	}

}
