public class Main {
    public static void main(String[] args) {

        CalendarLucru C1 = new CalendarLucru();
        Lucrator L1 = new Lucrator("Grigore", C1);

        try {


            L1.lucreaza("Luni");
            L1.lucreaza("Sambata");

        } catch (ExceptieZiLucratoare e) {
            System.out.println(e.getMessage());
        }
        finally {
            try{
                L1.lucreaza("Marte");
            }catch (ExceptieZiLucratoare e) {
                System.out.println(e.getMessage());
            }
        }

        try{
            Zi ziuaTest = null;
            ziuaTest.getNume();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        Zi[]ziuaTest2 = new Zi[5];

        try{
            System.out.println(ziuaTest2[100].getNume());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try{
            throw new Exception("Nu stiu ce sa scriu1");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se executa obligatoriu!");
        }


        try{
            g testGnou = new g("ABD", 24);
            f testF = new f(testGnou);
            testF.apeleazaG();

        }catch (ExceptieNoua e){
            System.out.println(e.getMessage());
        }

        ///De invatat check exception
        ///De invatat uncheck exception

        ///Tema 6.7

    }
}