
public class ejercicio3
{
    public String sanValentin(int D){
 String res="";
        
        if (D>0&&D<=31){
            int aux=D%10+D/10;
            if (aux%2==0)
            res="Dia normal";
            
            else
            res="Cruz de Dariel";
            
    }
    return res;
}
}