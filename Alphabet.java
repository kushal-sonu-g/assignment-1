import java.util.Scanner;

class Alphabet{
	public static void main(String args[]){
	Scanner Obj=new Scanner(System.in);
	
	System.out.print("Enter the alphobet:");
	String input=Obj.nextLine();
	char character=input.charAt(0);
	int chartoint=(int)character;
	
	chartoint = chartoint ^ 32;  //only the 6th bit must be toggled hence xor with 32 example a=0110 0001 and A=0100 0001
	character=(char)chartoint;	
	
	System.out.println(character);
	
	}
}