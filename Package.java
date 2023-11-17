class Package
{
    public static void main(String [] args)
    {
        Newclass a1 = new Newclass();
        a1.a = 10;
        a1.b = 15;
        int a3 = a1.a +a1.b;
        System.out.println("add is "+ a3);

        a1.addition();
        System.out.println("hello");

    }
}

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