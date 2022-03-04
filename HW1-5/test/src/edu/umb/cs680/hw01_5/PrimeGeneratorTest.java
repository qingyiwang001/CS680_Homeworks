package edu.umb.cs680.hw01_5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

public class PrimeGeneratorTest {

	@Test
	public void PrimesFrom1To10() {
		PrimeGenerator gen = new PrimeGenerator(1, 10);
		gen.generatePrimes();
		Long[] expectedPrimes = { 2L, 3L, 5L, 7L };
		assertArrayEquals(expectedPrimes, gen.getPrimes().toArray());
	}

	@Test
	public void PrimesFromMinus10To10WithTryCatch() {
		try {
			PrimeGenerator gen = new PrimeGenerator(-10, 10);
			fail("Wrong input values");
		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=-10 to=10", ex.getMessage());
		}
	}

	@Test
	public void PrimesFromMinus10To10WithAssertThrows() {
		assertThrows(RuntimeException.class, () -> {
			new PrimeGenerator(-10, 10);
		});
	}

	@Test
	public void PrimesFrom100To1WithTryCatch() {
		try {
			PrimeGenerator gen = new PrimeGenerator(100, 1);
			fail("Wrong input values");
		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=100 to=1", ex.getMessage());
		}
	}

	@Test
	public void PrimesFrom100To1WithAssertThrows() {
		assertThrows(RuntimeException.class, () -> {
			new PrimeGenerator(100, 1);
		});
	}

	@Test
	public void IsEvenMethodCheckWith4() {
		PrimeGenerator gen = new PrimeGenerator(1, 10);
		assertTrue(gen.isEven(4));
	}

	@Test
	public void IsEvenMethodCheckWith3() {
		PrimeGenerator gen = new PrimeGenerator(1, 10);
		assertFalse(gen.isEven(3));
	}

	@Test
	public void IsPrimeMethodCheckWith5() {
		PrimeGenerator gen = new PrimeGenerator(1, 10);
		assertTrue(gen.isPrime(5));
	}

	@Test
	public void IsPrimeMethodCheckWith6() {
		PrimeGenerator gen = new PrimeGenerator(1, 10);
		assertFalse(gen.isPrime(6));
	}

}

