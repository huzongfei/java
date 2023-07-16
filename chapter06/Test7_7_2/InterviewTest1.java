package Test7_7_2;



public class InterviewTest1 {
    public static void main(String[] args) {
        Base base = new Sub();
        base.add(1, 2, 3);



    }
}

class Base{
    public void add(int a, int... arr){
        System.out.println("base");
    }
//    public void show(){
//        System.out.println("这是Base类");
//    }

}
class Sub extends Base {
        public void add(int a ,int [] str){
            System.out.println("sub_1");
        }
        public void show(){
            System.out.println("这是Sub类");
        }
}

