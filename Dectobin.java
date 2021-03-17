import java.util.Scanner;

class Dectobin{
	public static void main(String args[]){
		Scanner Obj=new Scanner(System.in);
		
		System.out.print("Enter the Decimal number:");
		int input=Obj.nextInt();
		int number=0,i=0,j=0;
		int binary[]=new int[100];
		
		while(input != 0){
			number=input%2;
			input=input/2;
			i++;
			binary[i]=number;
		}
		for(j=i;j>0;j--)
		System.out.print(binary[j]);
		
	}
	
}