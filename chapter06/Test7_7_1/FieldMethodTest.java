package Test7_7_1;
// 继承成员变量和继承方法的区别



class Base {
    int count = 10;
    public void display(){
        System.out.println("这是Base的display");
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;
    public void display(){
        System.out.println("这是Sub的display");
        System.out.println(this.count);
    }
}

public class FieldMethodTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.count);  // 20
        sub.display(); // 这是Sub的display, 20
        Base base = sub;
        System.out.println(base == sub); // true
        System.out.println(base.count);  // 10
        base.display();  // 这是Sub的display, 20
    }
}
