package week2;

public class LAB1 {

	public static void main(String[] args) {
		
		//Write a program to calculate the area and perimeter of a rectangle.
		
		int l = 5;
		int w = 4;
		int a = l * w;
		int p = 2 *(l + w);
		
		System.out.println("Task 1: ");
		System.out.println("The area of a rectangle is: "+a);
		System.out.println("The perimeter of a rectangle is: "+p);

		//Write a program where you evaluate the result of an arithmetic expressions using unary operators.
		
		System.out.println(" ");
		System.out.println("Task 2: ");
		
		int num = 10;
		
		System.out.println("Number is: "+num);
		
		int result = ++num;
        System.out.println(
            "The value of result after pre-increment is: " + result);
 
        result = num++;
        System.out.println(
            "The value of result after post-increment is: " + result);
 
        result = --num;
        System.out.println(
            "The value of result after pre-decrement is: " + result);
 
        result = num--;
        System.out.println(
            "The value of result after post-decrement is: " + result);
        
        boolean status = true;
        System.out.println(
            "The value of result after is: " + status);
        System.out.println(
            "The value of result after is: " + !status);
		
		//Write a program to print the quotient and remainder of two numbers.
		
		int dividend = 5679;
		int divisor = 7;
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println(" ");
		System.out.println("Task 3: ");
		System.out.println("The quotient is: "+quotient);
		System.out.println("The remainder is: "+remainder);
	}

}
