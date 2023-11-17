class Emp
{
    int id;         // instance variable 
    int pno;
    void addd()
    {
      int c =  id + pno ;  // methods in another class 
        System.out.println("add is "+ c);
    }

     int add()
    {
      int c =  id + pno ;  // methods in another class 
        System.out.println("add is " );
        return c;
    }
}



class New               // class with main method 
{
    public static void main (String [] args )
    {
        Emp n1 = new Emp();         // creating object
        Emp n2 = new Emp();



        n1.id = 10 ;  // how to access variables
        n2.pno=15;
        int n3= n1.id + n2.pno;
         System.out.println("add is " + n3);

         n1.add();
         n2.addd();
    }
}