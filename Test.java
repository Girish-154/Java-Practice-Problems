class Test
{
    public static void main(String [] args)
   { Box b1 =new Box();
    b1.setBox(10,10,10);
    System.out.println("volume is"+ b1.getVolume());
   }
}
class Rectangle
{
    double length;
    double width;
    void setRectangle(double l,double w)
    {
        length=l;
        width=w;
    }
    double getArea()
    {
        return length*width;
    }
}
class Box extends Rectangle
{
    double height;
    void setBox(double l,double w,double h)
    {
        setRectangle(10,10);
        height=h;
    }
    double getVolume()
    {
        return length*width*height;
    }
}