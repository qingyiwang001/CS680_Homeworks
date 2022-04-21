package edu.umb.cs680.hw13;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw13.Car;

public class PriceCompareTest {

	@Test
	public void priceAscendingSortTest() {
		LinkedList<Car> usedCars = new LinkedList<>();
		Car car1 = new Car("Toyota", "RAV4", 70000, 2011, 7000.0f);
		Car car2 = new Car("Honda", "CRV", 80000, 2010, 8000.0f);
		Car car3 = new Car("Subaru", "FORESTER", 60000, 2012, 6000.0f);
		usedCars.add(car1);
		usedCars.add(car2);
		usedCars.add(car3);
		LinkedList<Car> expected = new LinkedList<>();
		expected.add(car3);
		expected.add(car1);
		expected.add(car2);
		Collections.sort(usedCars, Comparator.comparing(car -> car.getMileage()));
		Assert.assertArrayEquals(expected.toArray(), usedCars.toArray());
	}
}
