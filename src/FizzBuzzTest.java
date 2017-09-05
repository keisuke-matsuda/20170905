import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testFizzBuzz() {
		assertEquals(FizzBuzz.fizzBuzzConvert(1),"1");
		assertEquals(FizzBuzz.fizzBuzzConvert(3),"Fizz");
		assertEquals(FizzBuzz.fizzBuzzConvert(5),"Buzz");
		assertEquals(FizzBuzz.fizzBuzzConvert(15),"FizzBuzz");

	}

	@Test
	public void testFizzBuzz2() {
		String[] test = FizzBuzz.fizzBuzz(202);
		assertEquals(test[14], "FizzBuzz");
		assertEquals(test[9], "Buzz");
		assertEquals(test[5], "Fizz");
		assertEquals(test[10], "11");
		assertEquals(test[149], "FizzBuzz");
		//assertEquals(test[test.length-1], "Buzz");
		assertEquals(test[test.length-1], "202");
	}

	@Test
	public void testFizzBuzz3() {
		String[] expecteds = {"1","2","Fizz","4","Buzz"};
		String[] test = FizzBuzz.fizzBuzz(5);
//		assertEquals(test[14], "FizzBuzz");
//		assertEquals(test[9], "Buzz");
//		assertEquals(test[5], "Fizz");
		assertArrayEquals(expecteds, test);
	}

	@Test
	public void testFizzBuzz4() {
		String[] expecteds = {"Buzz","Fizz","7","8","Fizz","Buzz"};
		String[] test = FizzBuzz.fizzBuzz(5,10);
//		assertEquals(test[14], "FizzBuzz");
//		assertEquals(test[9], "Buzz");
//		assertEquals(test[5], "Fizz");
		assertArrayEquals(expecteds, test);
	}

	@Test
	public void testFizzBuzz5() {
		assertEquals(FizzBuzz.fizzBuzzConvert(1,"ctc","ctct"),"1");
		assertEquals(FizzBuzz.fizzBuzzConvert(3,"ctc","ctct"),"ctc");
		assertEquals(FizzBuzz.fizzBuzzConvert(5,"ctc","ctct"),"ctct");
		assertEquals(FizzBuzz.fizzBuzzConvert(15,"ctc","ctct"),"ctcctct");

	}
	@Test
	public void testFizzBuzz6
	() {
		String[] expecteds = {"ctct","11","ctc","13","14","ctcctct"};
		String[] test = FizzBuzz.fizzBuzz(10,15,"ctc","ctct");
//		assertEquals(test[14], "FizzBuzz");
//		assertEquals(test[9], "Buzz");
//		assertEquals(test[5], "Fizz");
		assertArrayEquals(expecteds, test);
	}

}
