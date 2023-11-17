 import java.util.Scanner;
 class Tinput 
{
    public static void main (String args [])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Taking Input From User");
        System.out.println(" Enter Number 1");
        int a = sc.nextInt();
        System.out.println(" Enter Number 2");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("sum is :"+ sum);
        main();

    }

    static void main ()
    {
        System.out.println("inside member method");
    }
    static 
    {
        System.out.println(" i am inside the static block");
        
    }
}