
/**
 * Write a description of class ejercicio12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ejercicio12
{
    public int nrodeRestas(int n,int m){
       
        int cont=0;
  while(n>m){
      n=n-m;
      cont++;
    }
    return cont;
}
}
 
  