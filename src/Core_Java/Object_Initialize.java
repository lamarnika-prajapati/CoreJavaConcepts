package Core_Java;

class Initialize
{
    int id;
    String name;
    public Initialize()
    {
    }
    public Initialize(int i, String n)
    {
        id=i;
        name=n;
    }
    public void getter(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public void setter()
    {
        System.out.println(id);
        System.out.println(name);
    }
}

public class Object_Initialize {
    public static void main(String[] args) {
        //Initailizing using reference variable
        Initialize obj=new Initialize();
        obj.id=101;
        obj.name="Lamarnika";
        System.out.println(obj.id);
        System.out.println(obj.name);

        //Initailizing using instance methods
        Initialize obj1=new Initialize();
        obj1.getter(102,"Rajat");
        obj1.setter();

        //Initailizing using constructor
        Initialize obj2=new Initialize(103,"Guddu");
        obj2.setter();

    }
}


