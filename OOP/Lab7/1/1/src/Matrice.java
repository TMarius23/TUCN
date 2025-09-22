public class Matrice {

    private Numeric[][] a;

    public Matrice(int num) {
        a = new Numeric[num][num];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(i % 2 == 0)
                    a[i][j] = new Complex((Math.random() * 10), (Math.random() * 10));
                else
                    a[i][j] = new Fractie((Math.random() * 10));
            }
        }
    }

    public Numeric[][] getA() {
        return a;
    }

    public void add(Numeric[][] b) {

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                a[i][j].add(b[i][j]);
            }
        }
    }

    public void sub(Numeric[][] b) {

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                a[i][j].sub(b[i][j]);
            }
        }
    }

    public Numeric[][] mul(Numeric[][] b) {

        if(!(a.length == b.length && a[0].length == b[0].length)){
            return null;
        }

        Numeric[][]aux = new Numeric[a.length][a.length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                aux[i][j] = new Complex(0, 0);
            }
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                for(int k = 0; k < a.length; k++){
                    aux[i][j] = aux[i][j].add(a[i][k].multiply(b[k][j]));
                }
            }
        }
        return aux;
    }

    public void print(){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


}
