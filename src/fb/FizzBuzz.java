package fb;

public class FizzBuzz {
	
	private int multiple1;
	private int multiple2;
	
	public FizzBuzz( int multiple1, int multiple2 ){
		this.multiple1 = multiple1;
		this.multiple2 = multiple2;
				
	}
	
	public String getOutput(int number){
		
		String output= "";
		output+= convertInput(number, multiple1, "Fizz");
		output+= convertInput(number, multiple2, "Buzz");
		
		if (output.equals("")){
			return ""+number;
		}else{
			return output;
		}
		
	}
	
	private String convertInput( int inputNumber, int factor, String output ){
		String numberString = ""+inputNumber;
		if ( inputNumber % factor == 0 || numberString.contains(factor+"")){
			return output;
		}
		return "";
	}
	
	public void printAllOutputs(int limit){
		for(int x=1; x <= limit; x++){
			System.out.println( getOutput(x) );
		}
	}
	
	public static void main(String args[]){
		FizzBuzz fb = new FizzBuzz(3,5);
		
		fb.printAllOutputs( 100 );
	}

}
