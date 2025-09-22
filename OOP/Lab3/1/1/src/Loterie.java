import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.lang.Math;

public class Loterie {


    private static int[] nrExtr = new int[7];
    private static long nrImp;

    private static BigInteger factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        return fact;
    }

    private static BigInteger mul(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }

    private static BigInteger div(BigInteger a, BigInteger b) {
        return a.divide(b);
    }

    private static BigDecimal div_d(BigDecimal a, BigInteger b) {

        BigDecimal bb = new BigDecimal(b);
        System.out.println(a.divide(bb, BigDecimal.ROUND_HALF_UP));

        return bb;
    }

    public static BigInteger sanseCastig649() {
        return div(factorial(49), (mul(factorial(6), factorial(43))));
    }


    public static void extragereNr(int n) {

        int[] rand = new int[n];
        for (int i = 0; i < n; i++) {
            rand[i] = (int) (Math.random() * 49) + 1;
            nrExtr[i] = rand[i];
            System.out.println(rand[i]);
        }
    }

    public static void afiNrExtr(int n) {
        int[] nr = nrExtr;

        for (int i = 0; i < n; i++) {
            System.out.print(nr[i] + " ");
        }
    }

    public static long despNr(long n, int poz_a, int size) {
        if (n == 0) return 0;

        while (poz_a > 0) {
            n = n >> 1;
            poz_a--;
        }

        long ct = (1L << size) - 1;

        return (n & ct);
    }

    /// Descrescator
    public static void impachetareNr() {
        int[] nr = nrExtr;
        //int nr[] = {34, 40, 5, 12, 33, 8};
        long imp = 0;

        imp = imp | nr[0];

        for (int i = 1; i < 6; i++) {

            int ok = 0;
            long des = despNr(imp, ok, 8);
            while (des <= nr[i] && ok < 46 && des != 0) {
                //System.out.println(des + " " + nr[i] + "\n---------");
                ok = ok + 8;
                des = despNr(imp, ok, 8);
            }
            long impC = 0;
            impC = despNr(imp, 0, ok);
//            System.out.println("ok = " + ok);

            imp = imp >> ok;
            imp = imp << 8;
            imp = imp | nr[i];
            imp = imp << ok;
            imp = imp | impC;

//            impC = despNr(imp, 0, 8);
//            System.out.print(impC + " ");
//            impC = despNr(imp, 8, 8);
//            System.out.print(impC + " ");
//            impC = despNr(imp, 16, 8);
//            System.out.print(impC + " ");
//            impC = despNr(imp, 22, 8);
//            System.out.print(impC + " ");
//            impC = despNr(imp, 28, 8);
//            System.out.print(impC + "\n--00--\n");
//            impC = despNr(imp, 34, 8);
//            System.out.print(impC + "\n--00--\n");

        }
        nrImp = imp;
    }

    public static void afiNrImp() {
        int[] nr = nrExtr;
        long imp = nrImp;

        for (int i = 0; i < 6; i++) {
            System.out.print(despNr(imp, 0, 8) + " ");
            imp = imp >>> 8;
        }
    }

    public static void main(String[] args) {

        ///a)
        System.out.println("Numarul total de combinarii posibile: " + div_d(BigDecimal.valueOf(1), sanseCastig649()));
        ///System.out.println("Factorial: " + factorial(4));


        ///b)
        System.out.println("Extragere numere: ");
        extragereNr(6);
        ///afiNrExtr(6);


        ///c)
        System.out.println("\n");
        System.out.println("Numerele extrase: ");
        ///System.out.println(despNr(7, 3, 8));

        impachetareNr();
        afiNrImp();

    }

}
