package Core_Java;

class Rectangle
{
    int length;
    int width;
    Rectangle(int l, int w)
    {
        length=l;
        width=w;
    }
    public void area()
    {
        System.out.println(length*width);
    }
}
public class Retangle_Area {
    public static void main(String[] args) {
        Rectangle rec1=new Rectangle(20,40);
        rec1.area();
        Rectangle rec2=new Rectangle(20,50);
        rec2.area();
    }
}
