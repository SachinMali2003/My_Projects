import java.util.Scanner;

public class AdditionOfThreeNumbers {

    public static void main(String[] args) {

        AdditionOfThreeNumbers aotn=new AdditionOfThreeNumbers();
        aotn.sum();
        aotn.subtract();
        aotn.multiplication();
        aotn.division();
    }

    public void sum(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 =sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();

        int sum=num1+num2;
        System.out.println("Sum of two numbers is :" +sum);

    }

    public void subtract(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 =sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();

        int sum=num1-num2;
        System.out.println("Subtraction of two numbers is :" +sum);

    }
    public void multiplication(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 =sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();

        int sum=num1*num2;
        System.out.println("Subtraction of two numbers is :" +sum);

    }
    public void division(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 =sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();

        int sum=num1/num2;
        System.out.println("Subtraction of two numbers is :" +sum);

        sc.close();
    }
}
