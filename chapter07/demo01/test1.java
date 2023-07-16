package demo01;
import java.util.Date;
public class test1 {
    public static void main(String[] args) {

        int it = 65;
        float fl = 65.0f;

        System.out.println("65 和 65.0f 是否相等？" + (it == fl)); // YES

        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65 和'A'是否相等？" + (it == ch1));// yes
        System.out.println("12 和 ch2 是否相等？" + (12 == ch2));//  yes
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1 和 str2 是否相等？"+ (str1 == str2));// no
        System.out.println("str1 是否 equals str2？"+(str1.equals(str2)));// yes

        System.out.println("hello".equals(new Date())); // No

    }

}
