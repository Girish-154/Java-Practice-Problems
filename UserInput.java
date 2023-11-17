 import package new ;
import java.util.Scanner;

class Newclass
{
    int a ;
    int b ;

    void addition ()
    {
        int c = a+b;
        System.out.println("add is "+ c);

    }
}


class UserInput
{
    public static void main(String [] args)
    {
      //  Newclass a1 = new Newclass();
        Scanner sc = new Scanner(System.in);
      System.out.println("enter num 1:");
       int x =sc.nextInt();
       
        System.out.println("enter num 2:");
       int y=sc.nextInt();
       
       int sum = x + y;
        System.out.println("addd is :"+ sum);

       // a1.addition();
        System.out.println("hello");

    }
}