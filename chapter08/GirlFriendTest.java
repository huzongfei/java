public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend instance1 = GirlFriend.getInstance();
        GirlFriend instance2 = GirlFriend.getInstance();
    }
}
class GirlFriend{
    private GirlFriend(){

    }

//    2. 声明当前类的实例
    private static GirlFriend instance = null;

    public static GirlFriend getInstance(){
        if(instance == null){
            instance = new GirlFriend();
        }
        return instance;
    }


}
