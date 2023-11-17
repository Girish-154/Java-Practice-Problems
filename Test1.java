class Test1 
{

}
class Student
{
    int rollno;
    String name;
    void setRollno(int r)
    {
        rollno=r;
    }
    int getRollno()
    {
        return r;
    }
    void setName(String s)
    {
        name=s;
    }
    String getName()
    {
        return name;
    }
}
class Test extends Student
{
    int test1,test2;
    void settest1(int t1)
    {
        test1=t1;
    }
    void settest2(int t2)
    {
        test2=t2;
    }
    int gettest1()
    {
        return test1;
    }
    int gettest2()
    {
        return test2;
    }
}
interface Sports
{
   static int smarks=10;
   int getSportsmarks();

}
class Result  extends Test implements Sports
{
    public int getSportsmarks()
    {
        return smarks;
    }
}