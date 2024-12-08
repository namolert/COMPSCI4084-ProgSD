import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {
    public int i = 3;

    public A(int val) {
        int i = val;
    }

    public static void main(String[] args) {

        A a = new A(5);
        System.out.println(a.i);

        int r = (int) 9.9;
        System.out.println(r);

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        long g = 5;
        g = 400000000000000L;
        System.out.println(g);
        System.out.println((int) g);

        double d = g;
        System.out.println(d);
        d = 99.99;
        System.out.println((int) d);

        int k = 1026;
        byte b = (byte) k;
        System.out.println(b);

        List<Object> l = new ArrayList<Object>();
        String s = "GOOD";
        int i = 8;
        {
            i = 10;
            System.out.println("In block " + i);
            {
                i = 99;
                System.out.println("Bet " + i);
            }
        }
        System.out.println("Out block " + i);
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i);
        // }

        String String = new String("PPP");
        System.out.println(String);

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);

        boolean result = l1.equals(l2); // This will return true
        System.out.println(result); // Output: true

    }
}
