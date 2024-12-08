import java.util.Arrays;
import java.util.Scanner;

public class App {
    private int max;

    public static void main(String[] args) throws Exception {
        int[] ints;
        String x = "osmdvkl";
        System.out.println(String.valueOf(x.toCharArray()[0]) + String.valueOf(x.toCharArray()[1]));

        int[] values = new int[] { 99, 234, 5 };
        int[] values2 = new int[] { 99, 1, 5 };
        System.out.println(values.length);
        for (var e : values) {
            System.out.println(e);
        }

        System.out.println(values[2]);

        Arrays.sort(values2);
        for (var e : values2) {
            System.out.println(e);
        }

        System.out.println(Arrays.compare(values, values2));
        System.out.println(Arrays.equals(values, values2));

        char c = 'y';
        switch (c) {
            case 'z':
                System.out.println("I'm Sad");
                break;
            case 'y':
                System.out.println("YES");
                break;
            case 'x':
                System.out.println("NO");
                break;
            default:
                System.out.println("DEFAULT");
        }

        App a = new App();
        double y = a.something();
        System.out.println(y);

    }

    double something() {
        return 9.9;
    }
}
