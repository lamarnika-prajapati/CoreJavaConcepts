package Concept_Java;

class Animal {

    void sound(){
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("barking");
    }

    void eats(){
        System.out.println("eating meat");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("meau");
    }
    void eats(){
        System.out.println("drinking milk");
    }
}

class Main
{
    public static void main(String[] args) {
        Animal an=new Animal();

        Animal dg=new Dog();
        dg.sound();
        ((Dog) dg).eats();
        Cat ct=new Cat();
        ct.eats();
        System.out.println();
    }
}

