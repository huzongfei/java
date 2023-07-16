package demo02;

public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("狗子" + getNickname() + "啃骨头");
    }
    public void watchHouse(){
        System.out.println("看家");
    }
}
