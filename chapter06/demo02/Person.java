package demo02;

public class Person {
    private Pet pet;
    public void adopt(Pet pet){
        this.pet = pet;
    }
    public void feed(){
        pet.eat();
    }
}
