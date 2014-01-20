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
		
		if ( number % this.multiple1 == 0 ){
			output+= "Fizz";
		}
		
		if ( number % this.multiple2 == 0 ){
			output+= "Buzz";
		}
		
		if (output.equals("")){
			return ""+number;
		}else{
			return output;
		}
		
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
