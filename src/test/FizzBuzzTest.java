package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import fb.FizzBuzz;

public class FizzBuzzTest {
	
	private int multiple1 = 3;
	private int multiple2 = 5;

    private FizzBuzz fb;

    @Before
    public void setUp() {
            fb = new FizzBuzz(multiple1,multiple2);
    }
	
	@Test
	public void firstNumber(){		
		Assert.assertEquals("1", fb.getOutput(1));	
	}
	
	@Test
	public void secondNumber(){
		Assert.assertEquals("2", fb.getOutput(2));
	}
	
	@Test
	public void thirdNumber(){
		Assert.assertEquals("Fizz", fb.getOutput(3));
	}

	@Test
	public void fithNumber(){
		Assert.assertEquals("Buzz", fb.getOutput(5));
	}
	
	@Test
	public void sixthNumber(){
		Assert.assertEquals("Fizz", fb.getOutput(6));
	}
	
	@Test
	public void seventhNumber(){
		Assert.assertEquals("7", fb.getOutput(7));
	}
	
	@Test
	public void eighthNumber(){
		Assert.assertEquals("8", fb.getOutput(8));
	}
	
	@Test
	public void ninthNumber(){
		Assert.assertEquals("Fizz", fb.getOutput(9));
	}
	
	@Test
	public void tenthNumber(){
		Assert.assertEquals("Buzz", fb.getOutput(10));
	}
	
	@Test
	public void fifteenthNumber(){
		Assert.assertEquals("FizzBuzz", fb.getOutput(15) );
	}
	
	@Test
	public void contains3(){
		Assert.assertEquals("Fizz", fb.getOutput(13));
	}
}
