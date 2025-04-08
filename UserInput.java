import java.util.Scanner;
public class UserInput{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num1=sc.nextInt();
    System.out.println("Enter second number: ");
    int num2=sc.nextInt();
    add(num1,num2);
    sub(num1,num2);
    mul(num1,num2);
    div(num1,num2);
  }
  public static void add(int a,int b){
    int sum=a+b;
    System.out.println("The sum of two number is: "+sum);
  }
  public static void sub(int a,int b){
    int min=a-b;
    System.out.println("The sub of two number is: "+min);
  }
  public static void mul(int a,int b){
    int mult=a*b;
    System.out.println("The mul of two number is: "+mult);
  }
  public static void div(int a,int b){
    int divi=a/b;
    System.out.println("The div of two number is: "+divi);
  }
}
