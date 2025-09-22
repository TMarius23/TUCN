public class Goldbach {

    private static int verifNrPrim(int nr)
    {
        if(nr < 2)
            return 0;

        for(int i = 2; i <= nr / 2; i++)
            if(nr % i == 0)
                return 0;
        return 1;
    }

    public static int veirifConj(int m, int n)
    {
        for(int i = m; i <= n; i++)
        {
            if(i % 2 == 0 && i > 2)
            {
                int ok = 0;
                for(int j = 1; j < i; j++)
                {
                    if(verifNrPrim(j) == 1 && verifNrPrim(i - j) == 1){
                        ok = 1;
                    }
                }
                System.out.println(i + " " + ok);
                if(ok == 0)
                    return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){

        System.out.println(veirifConj(4, 10 ));

    }

}
