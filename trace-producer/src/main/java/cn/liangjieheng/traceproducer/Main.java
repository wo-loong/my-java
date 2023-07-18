package cn.liangjieheng.traceproducer;

public class Main {
    public static final String str = "abc";
    public static final int a = 0;

    public static void main(String[] args) {
        show(a);
    }

    public static void show(int a) {
        System.out.println(str + a);
    }
}
