import java.util.Random;

public class Matrice {

    private Complex[][] matr;

    public Matrice(int nr_lini, int nr_col) {
        this.matr = new Complex[nr_lini][nr_col];

        for (int i = 0; i < nr_lini; i++) {
            for (int j = 0; j < nr_col; j++) {
//                this.matr[i][j] = new Complex((double)Math.random() * 10, (double)Math.random() * 10);
                this.matr[i][j] = new Complex(new Random().nextInt(10), new Random().nextInt(10));
            }
        }
    }

    public void af_matr() {
        for (int i = 0; i < this.matr.length; i++) {
            for (int j = 0; j < this.matr[i].length; j++) {
                System.out.print(matr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public Complex getElement(int i, int j) {
        return this.matr[i][j];
    }

    public void adunare_matr(Matrice matr1) {
        for (int i = 0; i < this.matr.length; i++) {
            for (int j = 0; j < this.matr[i].length; j++) {
                this.matr[i][j].adunare(matr1.getElement(i, j));
                // this.matr[i][j].adunare(matr1.matr[i][j]);
            }
        }
    }

    public void scadere_matr(Matrice matr1) {
        for (int i = 0; i < this.matr.length; i++) {
            for (int j = 0; j < this.matr[i].length; j++) {
                this.matr[i][j].scadere(matr1.getElement(i, j));
                // this.matr[i][j].adunare(matr1.matr[i][j]);
            }
        }
    }

    public void inmultire_matr(Matrice matr1) {
        Matrice matr2 = new Matrice(matr.length, matr[0].length);

        for (int i = 0; i < matr2.matr.length; i++) {
            for (int j = 0; j < matr2.matr[i].length; j++) {
                ///matricea noastra propriu zisa se afla in matr
                ///vreau sa lucrez cu obiectul care are matricea respectiva
                matr2.matr[i][j] = new Complex(0, 0);
            }
        }

        ///tema
        for (int i = 0; i < this.matr.length; i++) {
            for (int j = 0; j < this.matr[i].length; j++) {
                Complex k1 = this.matr[i][j].inmultire_r(matr1.matr[i][j]);

                matr2.matr[i][j].adunare(k1);
            }
        }
    }

    public void inmultire_matr_scalar(int k) {
        for (int i = 0; i < this.matr.length; i++) {
            for (int j = 0; j < this.matr[i].length; j++) {
                this.matr[i][j].inmultire_scalar(k);
            }
        }
    }

    public static void main(String[] args) {

    }
}
