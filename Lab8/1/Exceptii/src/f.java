public class f {

    private g testG;

    public f(g testG){
        this.testG = testG;
    }

    public void apeleazaG() throws ExceptieNoua{

        try{
            testG.setNume("ABD");
            testG.getNume();

        }catch (ExceptieTestFG ex){
            throw new ExceptieNoua("Exceptie aruncata din f " + ex.getMessage());
        }

    }

}
