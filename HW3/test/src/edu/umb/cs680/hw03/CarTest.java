package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
	
	private String[] carToStringArray(Car car) {
		String[] carStringArray = new String[3];
		carStringArray[0] = car.getMake();
		carStringArray[1] = car.getModel();
		carStringArray[2] = car.getYear() + "";
		return carStringArray;
	}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
		String[] expected = {"Toyota", "RAV4", "2018"};
		Car actual = new Car("Toyota", "RAV4", 2018);
		assertArrayEquals(expected, carToStringArray(actual));
	}

}
