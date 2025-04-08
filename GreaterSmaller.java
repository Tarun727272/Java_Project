import java.util.Scanner;
public class GreaterSmaller{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three number: ");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();
    greaterNum(num1,num2,num3);
    smallerNum(num1,num2,num3);
  }
  public static void greaterNum(int a,int b,int c){
    if(a>b && a>c){
      System.out.println(a+" is larger");
    }else if(b>a && b>c){
      System.out.println(b+" is larger");
  }else{
      System.out.println(c+" is larger");
    }
    
  public static void smallerNum(int a,int b,int c){
     if(a<b && a<c){
      System.out.println(a+" is smaller");
    }else if(b<a && b<c){
      System.out.println(b+" is smaller");
  }else{
      System.out.println(c+" is smaller");
    }
  }
}

  
