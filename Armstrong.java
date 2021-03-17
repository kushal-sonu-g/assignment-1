import java.util.Scanner;

class Armstrong {
	public static void main(String args[]){
		Scanner Obj=new Scanner(System.in);
		
		System.out.println("Enter a number :")
		int input=Obj.nextInt();
		int number=input,sum=0,count=0,digit=0,i,digitcopy=0;
		
		while(number != 0){
			count++;
			number = number/10;
		}
		number=input;
		
		
		while(number != 0){
			digit=number%10;
			digitcopy=digit;
			number=number/10;
			for(i=1;i<count;i++){
				digit=digitcopy*digit;
			}
			
			//System.out.println("digit:"+digit);
			sum=sum+digit;
		}
			
		
		
		System.out.println("count:"+count);
		System.out.println("sum:"+sum);
		if(input == sum)
			System.out.println("Number is an Armstrong number");
		else
			System.out.println("Number is not an Armstrong number");
		
	}

}