import java.util.Scanner;

public class Impachetare {

    private short varsta;
    private short sex;
    private short inaltime;

    public Impachetare(short varsta, short sex, short inaltime)
    {
        this.varsta = varsta;
        this.sex = sex;
        this.inaltime = inaltime;
    }

    public short nrImp()
    {
        short varsta = this.varsta;
        short sex = this.sex;
        short inltime = this.inaltime;

        short nr = 0;
        nr = (short) (nr | varsta);
        nr = (short) ((short) nr << 1);
        nr = (short) (nr | sex);
        nr = (short)(nr << 8);
        nr = (short) (nr | inltime);

        return nr;
    }

    public void nrDesp(short nr)
    {
        short varsta = 0;
        short sex = 0;
        short inltime = 0;

        varsta = (short)(nr >> 9);
        sex = (short)((nr >> 8) & 1);
        inaltime = (short)(nr & 0X00FF);

        System.out.println("Varsta: " + varsta);
        System.out.println("Sex: " + sex);
        System.out.println("Inaltime: " + inaltime);
    }



    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("varsta: ");
        short varsta = in.nextShort();
        System.out.print("sex: ");
        short sex = in.nextShort();
        System.out.print("inaltime: ");
        short inaltime = in.nextShort();

        Impachetare pachet =new Impachetare(varsta,sex, inaltime);

        short nr = pachet.nrImp();
        System.out.println(nr);

        pachet.nrDesp(nr);


    }

}
