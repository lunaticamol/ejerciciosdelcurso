public class Ejercicio8 {
   
    public int invertirPrimerSeg(int n){
    int res=0;
    int dig=n%10;
    res=dig*10+primerdig(n);
    return res;
}
private int primerdig(int n){
    
        while(n>9){
               n=n/10;
            
            
    }
    return n;
}
}