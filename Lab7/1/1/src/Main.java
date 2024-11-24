public class Main {
    public static void main(String[] args) {

        Numeric n1 = new Complex(17, 3);
        Numeric n2 = new Complex(4, 5);

        Numeric suma = n1.add(n2);
        System.out.println(suma);
        System.out.println(n2);

        Numeric diff = n1.sub(n2);
        System.out.println(diff);

        Numeric multiply = n1.multiply(n1);
        System.out.println(multiply);



        Fractie f1 = new Fractie(3.56);
        Fractie f2 = new Fractie(9.12);

        f1.add(f2);
        System.out.println(f1);
        System.out.println(f2);

        Numeric fr1 = f1.sub(f2);
        System.out.println(fr1);
        System.out.println();
        System.out.println();

        Numeric fr2M = f1.multiply(f2);
        System.out.println(fr2M);
        System.out.println();
        System.out.println();


        Matrice m1 = new Matrice(4);
        m1.print();
        System.out.println();
        System.out.println();


        Matrice m2 = new Matrice(4);
        m2.print();
        System.out.println();
        System.out.println();

        Numeric[][] matr_test = m1.mul(m2.getA());
        for(int i = 0; i < matr_test.length; i++){
            for(int j = 0; j < matr_test.length; j++){
                System.out.print(matr_test[i][j] + " ");
            }
            System.out.println();
        }
    }
}