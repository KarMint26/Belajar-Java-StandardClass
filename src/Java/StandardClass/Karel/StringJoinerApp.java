package Java.StandardClass.Karel;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        String[] names = { "Karel", "Trisnanto", "Utomo" };

        StringJoiner stringJoiner = new StringJoiner(
                " || ", "<< ", " >>"
        ); // Delimiter untuk pembatas antar String, Prefix untuk awalan Array String, Suffix untuk akhiran.

        for (String name : names){
            stringJoiner.add(name);
        }

        System.out.println("Bentuk StringJoiner Ke-1");
        System.out.println(stringJoiner);

        System.out.println("\nBentuk StringJoiner Ke-2");
        StringJoiner joiner = new StringJoiner(" ** ", "~~ ", " ~~");

        joiner.add("Yohanes");
        joiner.add("Karel");
        joiner.add("Trisnanto");
        joiner.add("Utomo");

        System.out.println(joiner);

    }
}
