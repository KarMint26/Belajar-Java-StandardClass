package Java.StandardClass.Karel;

public class NumberApp {
    public static void main(String[] args) {

        Integer Intvalue = 10;

        Long longValue = Intvalue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();
        System.out.println(shortValue);

        System.out.println("\nIni adalah integer Bukan Primitif karena menggunakan valueOf");
        String contoh = "10000";
        Integer contohInt = Integer.valueOf(contoh); // valueOf untuk tipe data Bukan primitif.
        System.out.println(contohInt);

        System.out.println("\nIni adalah integer Primitif dengan parseInt");
        String contoh2 = "20000";
        int contohInt2 = Integer.parseInt(contoh2); // parseInt untuk tipe data Primitif.
        System.out.println(contohInt2);

        System.out.println("\nContoh valueOf untuk Double Bukan Primitif / Object");
        String contoh3 = "20.12";
        Double contohDouble = Double.valueOf(contoh3);
        System.out.println(contohDouble);

        System.out.println("\nContoh parseDouble untuk Double Primitif");
        double contohDoublePrimitif = Double.parseDouble(contoh3);
        System.out.println(contohDoublePrimitif);

    }
}
