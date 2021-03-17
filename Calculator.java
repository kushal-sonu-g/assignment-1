class Calculator{
	public static void main(String args[]){
		
		int input1=Integer.parseInt(args[0]);
		int input2=Integer.parseInt(args[2]);
		
		if(args[1].charAt(0) == '+')
			System.out.print(input1 + input2);
		
		else if(args[1].charAt(0) == '-')
				System.out.print(input1 - input2);
			
		else if(args[1].charAt(0) == '/')
				System.out.print(input1/input2);
			
		else if(args[1].charAt(0) == 'x')
				System.out.print(input1 * input2);
		
		else 
				System.out.print("enter +,-,/ or x");
		}
		
		
		
	}