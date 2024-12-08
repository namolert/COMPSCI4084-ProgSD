public class Test {
    int value;

    public Test(int i) {
        this.value = i;
    }

    public int foo(int x) {
        return x;
    }

    public String foo(String s) {
        return s;
    }

    public static void main(String[] args) {
        Test test = new Test(5);
        System.out.println(test.value);
        System.out.println(test.foo(1));
        System.out.println(test.foo("Poo"));
    }
}
