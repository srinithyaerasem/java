class Animal {
    void makesound(){
        System.out.println("Animal makes sound");
    }

    
}
class Cat extends Animal{
    void makesound(){
        System.out.println("Meow");
    }

}
class Dog extends Animal{
    void makesound(){
        System.out.println("Barks");
    }
}
public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a1=new Cat();
        Animal a2 = new Dog();
        a1.makesound();
        a2.makesound();
        
    }
    
}
