public class Ejercicio2
{
    public String esPrimoCompuesto(int N){
        String res="";
        if(Divisores(N)>2)
        res="Es numero compuesto";
        else
        res="Es numero primo";
    return res;
    }
    private int Divisores(int b){
        
        int div=0;
        for(int divisores=1;divisores<=b; divisores++){
            if(b%divisores==0)
            div++;
        }
        return div;
    }
}