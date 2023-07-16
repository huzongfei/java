package demo03;

// 成员变量没有多态性
// 若子类重写了父类方法，就意味着子类里定义的方法彻底覆盖了父类里的同名方法，
// 系统将不可能把父类里的方法转移到子类中。
// 对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，
// 这个实例变量依然不可能覆盖父类中定义的实例变量
public class TestVariable {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.a);
        System.out.println(((Sub)base).a);

        Sub sub = new Sub();
        System.out.println(sub.a);
        System.out.println(((Base)sub).a);

    }
}
class Base{
    int a = 1;
}

class Sub extends Base{
    int a = 10;
}
