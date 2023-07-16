package demo04;

public class Cat extends Pet {


    @Override
    public void eat() {
        System.out.println("喵咪" + getNickname() + "吃鱼仔");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
