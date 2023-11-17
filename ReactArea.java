class Rectangle
{
    int length,width;                // Declaration of variables

    void getData(int x,int y)        // Declaration of method
    {
        length = x;
        width = y;
    }

    int rectArea()                  // Declaration of another method
    {
        int area = length * width;
        return (area);
    }
}

class ReactArea                     //class with main method 
{
    public static void main (String [] args)
    {
        int area1,area2;
        Rectangle rect1  =new Rectangle();  //creating object
        Rectangle rect2 =new Rectangle();

        rect1.length = 15;                // accesing variables
        rect2.width = 10;
        area1 = rect1.length * rect2.width;


        rect2. getData(20,12);              // Accesing methods
        area2 = rect2.rectArea();

        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);


    }
}