
/**
 * Write a description of class ejercicio13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ejercicio13
{
     public String amigos(int n,int m){
         int sumaN= sumaNumPropios(n);
        int sumaM= sumaNumPropios(m);
        String res="";
        if(sumaN==m&&sumaM==n)
        
          res="son amigos";
            else 
            
           res="no son amigos"; 
           
           return res;
        }
    
   
    
    private int sumaNumPropios(int a){
        int sum=0;
        for(int posibleDiv=1; posibleDiv<=(a/2) ; posibleDiv++){
            if(a%posibleDiv==0){
                sum+=posibleDiv; // sum= sum + posibleDiv;
            }
        }
        return sum;
    }
    
   
            
       
}
