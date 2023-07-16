package demo02;

public class TestPet {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.setNickname("小白");
        pet.eat();
        pet = new Cat();
        pet.setNickname("雪球");
        pet.eat();
    }
}
