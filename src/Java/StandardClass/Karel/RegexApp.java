package Java.StandardClass.Karel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {

        String name = "Karel Trisnanto Utomo Mahasiswa Teknik Informatika"; // Setiap satu baris character dicek regexnya.

        Pattern pattern = Pattern.compile("[a-zA-Z]*a[a-zA-Z]*"); // Jika di tengah tidak ada a maka tidak di eksekusi
        Matcher matcher = pattern.matcher(name); // Hasilnya adalah utomo dan teknik tidak di eksekusi karena tengah char tidak ada a

        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }

    }
}
