public class BankTest {
    public static void main(String[] args) {
        Bank instance1 = Bank.getInstance();
        Bank instance2 = Bank.getInstance();
        System.out.println(instance1==instance2);
    }
}



class Bank{

//    1、类的1构造器私有化
    private Bank(){

    }

//    2、在类的内部创建当前类的实例
//    4、此属性也必须声明为static
    private static Bank instance = new Bank();
//    3、使用getxxx()方法获取当前类的实例，必须声明为static
    public static Bank getInstance(){
        return instance;
    }

}
