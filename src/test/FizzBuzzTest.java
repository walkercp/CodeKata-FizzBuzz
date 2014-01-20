package test;

import org.junit.Test;
import org.junit.Assert;

import fb.FizzBuzz;

public class FizzBuzzTest {
	
	private int multiple1 = 3;
	private int multiple2 = 5;
	
	@Test
	public void firstNumber(){		
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);	
		Assert.assertEquals("1", fb.getOutput(1));	
	}
	
	@Test
	public void secondNumber(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("2", fb.getOutput(2));
	}
	
	@Test
	public void thirdNumber(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("Fizz", fb.getOutput(3));
	}

	@Test
	public void fithNumber(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("Buzz", fb.getOutput(5));
	}
	
	@Test
	public void sixthNumber(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("Fizz", fb.getOutput(6));
	}
	
	@Test
	public void seventhNumber(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("7", fb.getOutput(7));
	}
	
	@Test
	public void eighthNumber(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("8", fb.getOutput(8));
	}
	
	@Test
	public void ninthNumber(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("Fizz", fb.getOutput(9));
	}
	
	@Test
	public void tenthNumber(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("Buzz", fb.getOutput(10));
	}
	
	@Test
	public void fifteenthNumber(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("FizzBuzz", fb.getOutput(15) );
	}
	
	@Test
	public void contains3(){
		FizzBuzz fb = new FizzBuzz(multiple1,multiple2);
		Assert.assertEquals("Fizz", fb.getOutput(13));
	}
}
