package Java.StandardClass.Karel;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("10000000000000000000000");
        BigInteger b = new BigInteger("20000000000000000000000");

        BigInteger c = a.add(b); // Operator +
        BigInteger d = b.divide(a); // Operator /
        BigInteger e = b.subtract(a); // Operator -
        BigInteger f = a.multiply(b); // Operator *
        BigInteger g = b.mod(a); // Operator %

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
