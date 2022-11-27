package Java.StandardClass.Karel;

public class MathApp {

    public static double[] myNumber = { 124.23, 100.10, 52.44, 32.65 };

    public static void main(String[] args) {

        System.out.println("\nMencari Nilai Terkecil");
        int min = Math.min(100, 200);
        System.out.println(min); // Mencari Angka Terkecil

        System.out.println("\nMencari Nilai Terbesar");
        int max = Math.max(200,500);
        System.out.println(max); // Mencari Angka Terbesar

        System.out.println("\nMenaikkan 1 Angka");
        int increment = Math.incrementExact(10);
        System.out.println(increment); // Menaikkan Angka ke 11

        System.out.println("\nMenurunkan 1 Angka");
        int decrement = Math.decrementExact(10);
        System.out.println(decrement); // Menurunkan Angka ke 9

        System.out.println("\nMath Ceil yaitu membulatkan value number ke atas (Up to)");
        for (double myMath : myNumber){
            double upEqualsUpToAfterComa = Math.ceil(myMath);
            System.out.println(upEqualsUpToAfterComa);
        }

        System.out.println("\nMath Floor yaitu membulatkan value number ke bawah (Down to)");
        for (double myMath : myNumber){
            double upEqualsUpToAfterComa = Math.floor(myMath);
            System.out.println(upEqualsUpToAfterComa);
        }

        System.out.println("\nMath Round yaitu membulatkan ke atas jika dibelakang koma lebih dari 5 dan ke bawah jika kurang dari 5");
        for (double myMath : myNumber){
            double upEqualsUpToAfterComa = Math.round(myMath);
            System.out.println(upEqualsUpToAfterComa);
        }

        System.out.println("\nIni adalah Math Rin sama seperti Round");
        double myRin = Math.rint(10.67);
        double myRin2 = Math.rint(10.23);
        System.out.println(myRin);
        System.out.println(myRin2);

        System.out.println("\nIni adalah Math Pow");
        double myPow = Math.pow(12, 3);
        System.out.println(myPow);

        System.out.println("\nMath nextAfter");
        for (double myMath : myNumber){
            double upEqualsUpToAfterComa = Math.nextAfter(myMath, 0b1100100);
            System.out.println(upEqualsUpToAfterComa);
        }

        System.out.println("\nMath SIN");
        double mySin = Math.sin(90);
        System.out.println(mySin);

    }
}
