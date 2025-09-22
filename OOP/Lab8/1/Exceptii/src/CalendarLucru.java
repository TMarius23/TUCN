public class CalendarLucru {

    private Zi[] saptamana = new Zi[7];

    public CalendarLucru(){
        saptamana[0] = new Zi("Luni", true);
        saptamana[1] = new Zi("Marti", true);
        saptamana[2] = new Zi("Miercuri", true);
        saptamana[3] = new Zi("Joi", true);
        saptamana[4] = new Zi("Vineri", true);
        saptamana[5] = new Zi("Sambata", false);
        saptamana[6] = new Zi("Duminica", false);
    }

    public Zi[] getSaptamana() {
        return saptamana;
    }

    public Zi getZi(String zi) throws ExceptieZiLucratoare{
        for(int i = 0; i < saptamana.length; i++){
            if(saptamana[i].getNume().equals(zi))
                return saptamana[i];
        }
        throw new ExceptieZiLucratoare("Ziua nu exista in calendar");
    }

}
