package Java.StandardClass.Karel;

public class StringBuilderApp {
    public static void main(String[] args) {

        String name = "Karel";

        name = name + " Trisnanto";

        name = name + " Utomo";

        System.out.println("\nTanpa String Builder");
        System.out.println(name);

        // Karel
        // Karel Trisnanto
        // Karel Trisnanto Utomo
        // Banyak memakan memory jika menggunakan String Manipulation secara normal.

        System.out.println("\nDibutuhkan StringBuilder");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Karel");
        stringBuilder.append(" ");
        stringBuilder.append("Trisnanto");
        stringBuilder.append(" ");
        stringBuilder.append("Utomo");

        String name2 = stringBuilder.toString();
        System.out.println(name2);

    }
}
