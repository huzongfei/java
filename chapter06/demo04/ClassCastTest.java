package demo04;

public class ClassCastTest {
    public static void main(String[] args) {
        Dog dog = new Dog();

//        向上转型
        Pet pet = new Dog();
        pet.setNickname("小白");
        pet.eat();

        Dog d = (Dog) pet;
        System.out.println("d.nickname = " + d.getNickname());
        d.eat();
        d.watchHouse();
//        Cat cat =  (Cat) pet;  //编译通过，运行报错

    }
}
