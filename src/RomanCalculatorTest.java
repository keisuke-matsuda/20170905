import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class RomanCalculatorTest {

	@Ignore
	@Test
	public void test() {
		assertEquals("XLII",RomanCalculator.ArabToRom(42));
		assertEquals("XCVI",RomanCalculator.ArabToRom(96));
		assertEquals("CCCLXXXVII",RomanCalculator.ArabToRom(387));
		assertEquals("CMXXXIV",RomanCalculator.ArabToRom(934));
		assertEquals("MMMCMX",RomanCalculator.ArabToRom(3910));
	}

	@Ignore
	@Test
	public void test1() {
		assertEquals(1,RomanCalculator.RomToArab("IIYYYYY"));
	}

	@Test
	public void test2() {
		assertEquals(1,RomanCalculator.ChangeToInt("I"));
		assertEquals(5,RomanCalculator.ChangeToInt("V"));
		assertEquals(10,RomanCalculator.ChangeToInt("X"));
		assertEquals(50,RomanCalculator.ChangeToInt("L"));
		assertEquals(100,RomanCalculator.ChangeToInt("C"));
		assertEquals(500,RomanCalculator.ChangeToInt("D"));
		assertEquals(1000,RomanCalculator.ChangeToInt("M"));
	}

	@Test
	public void test3() {
		assertEquals(1,RomanCalculator.RomToArab("I"));
		assertEquals(3,RomanCalculator.RomToArab("III"));
		assertEquals(4,RomanCalculator.RomToArab("IV"));
		assertEquals(42,RomanCalculator.RomToArab("XLII"));
		assertEquals(387,RomanCalculator.RomToArab("CCCLXXXVII"));
	}

	@Test
	public void test4() {
		assertEquals("CCCLXXXVII",RomanCalculator.add("CC","CLXXXVII"));
		assertEquals("XIII",RomanCalculator.sub("CC","CLXXXVII"));
		assertEquals("DC",RomanCalculator.mul("XL","XV"));
		assertEquals("XXX",RomanCalculator.div("DC","XX"));

	}
}

