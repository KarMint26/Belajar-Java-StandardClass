package Java.StandardClass.Karel;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String name = "Karel Trisnanto Utomo";

        StringTokenizer stringTokenizer = new StringTokenizer(name, " ");

        while (stringTokenizer.hasMoreTokens()){
            String result = stringTokenizer.nextToken();
            System.out.println(result);
        }

    }
}
