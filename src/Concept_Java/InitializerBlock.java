package Concept_Java;
class ParentInitializerBlock
{
    ParentInitializerBlock()
    {
        System.out.println("Parent Constructor");
    }
    {System.out.println("Parent Initializer Block");}
}
public class InitializerBlock extends ParentInitializerBlock{
 InitializerBlock()
{
    System.out.println("Child Constructor");
}
{System.out.println("Child Initializer Block");}

    public static void main(String[] args) {
        InitializerBlock ib=new InitializerBlock();
    }
}

