
public class Ejercicio1
{
    public int contDig(int N){
        int res=0;
        while(N!=0){
            N=N/10;
            res=res+1;
        }
        return res;
    }
}
        
