public class Main {
    public static void main(String[] args) {

        Double[][] m1 = new Double[][]{{1.0, 2.3, 3.8}, {4.1, 5.2, 6.5}, {1.3, 1.0, 1.9}};
        Double[][] m2 = new Double[][]{{1.3, 1.2, 1.7}, {2.8, 2.2, 2.1}, {0.7, 0.0, 0.1}};

        DoubleMatrix doubleMatrix= new DoubleMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, doubleMatrix.addMatrx(m1, m2), '+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1, m2, doubleMatrix.multiplyMatrix(m1, m2), '*');

    }

}
