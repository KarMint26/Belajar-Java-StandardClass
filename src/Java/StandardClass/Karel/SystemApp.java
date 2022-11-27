package Java.StandardClass.Karel;

public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.getenv("HOME"));
        System.out.println(System.getenv("APP"));

        System.gc();

        System.exit(100);

        System.out.println("HI...");

    }
}
