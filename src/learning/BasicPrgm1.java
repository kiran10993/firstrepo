package learning;

import java.util.Scanner;

public class BasicPrgm1 {
public void Operation (int n,int result, int a, int b)
{
	
	switch(n)
    {
    case 1:
  	result = a+b;
  	System.out.println("addition of two number : "+result);
  	break;
    case 2 :
  	  result = a-b;
  	  System.out.println("subtraction of two number : "+result);
  	  break;
    case 3 :
  	  result = a*b;
  	  System.out.println("multiplication of two number : "+result);
  	  break;
    case 4:
  	  if(b==0){
  		  System.out.println("ENTER THE VALUE EXCEPT ZERO VALUE");
  	  }
  	  else
  	  {
  	  result = a/b;
  	  System.out.println("division of two number : "+result);
  	  }
  	  break;
    case 5:
  	  result = (int) Math.sqrt(a);
  	  System.out.println("square root of the integer : "+result);
  	  break;
    }
}
	
	public static void main(String[] args) {
		
	int m;
	int num1=0,num2=0;
	int result1 = 0;
	 BasicPrgm1 opt = new BasicPrgm1();
    System.out.println("Hello user");
    
	System.out.println("Select the type of operation");
	System.out.println("[1]ADD\n[2]SUB\n[3]MUL\n[4]DIV\n[5]SQRT\n");
	Scanner input= new Scanner (System.in);
	 m = input.nextInt();
	
	//Scanner input1= new Scanner(System.in);
   if(m==5)
   {
	   System.out.println("enter the Number");
	   num1 = input.nextInt();
     
	   opt.Operation(m,result1,num1,num2);	   
   }
   
   else{
	   System.out.println("enter the integers");
	   System.out.println("enter the first value");
	   num1 = input.nextInt();
	   System.out.println("enter the second value");
   // Scanner input2= new Scanner(System.in);
    num2 = input.nextInt();
    
    opt.Operation(m,result1,num1,num2);	   
   }
      }
	}

