
/**
 * Write a description of class jercicio3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  

public class Ejercicio3 {
    public int invertirNum(int n){
        int numRes=0;
        while(n>0){
            int dig= n%10;
            numRes= numRes*10+dig;
            n/=10;  
        }
        return numRes;
    }
}