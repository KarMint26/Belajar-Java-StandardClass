package Java.StandardClass.Karel;

import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {

        String name = "Karel Trisnanto Utomo";
        String lowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(name.length());
//        System.out.println(name.startsWith("Karel")); hasilnya true
//        System.out.println(name.endsWith("Arsen")); hasilnya false

        String[] names = name.split(" ");
        System.out.println(Arrays.toString(names));

        for (String named : names){
            System.out.println(named);
        }

//        System.out.println(" ".isBlank()); // TRUE
//        System.out.println("".isEmpty()); // TRUE
        System.out.println("\nChar At");
        System.out.println(name.charAt(0));

        System.out.println("\nString to Char Array");
        char[] chars = name.toCharArray();
        for (char itsChar : chars){
            System.out.println(itsChar);
        }

    }
}
