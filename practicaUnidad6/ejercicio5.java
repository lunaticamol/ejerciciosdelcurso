
/**
 * Write a description of class ejercicio5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ejercicio5
{
    public int cantAcarreo(int A, int B){
        
        int cant=0;
        int llevo=0;
        
        while(A!=0||B!=0){
            int suma=A%10+B%10+llevo;
            if(suma>9){
               llevo=1;
            cant++;   
            }
            
            A=A/10;
            B=B/10;
           
        }
        
        return cant;
    }
}