package demo01;

class Creature{
    public Creature() {
        System.out.println("Creature 无参数的构造器");
    }
}

class Animal extends Creature{
    public Animal(String name){
        System.out.print("Animal 带一个参数的构造器，该动物的名字为" + name);
    }
}
public class Dog extends Animal{
    public Dog(){
        super("汪汪队阿奇");
    }

    public static void main(String[] args) {
        new Dog();

    }
}
