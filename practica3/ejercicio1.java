

public class ejercicio1
{ 
    public String esCapicua(int N){
        String res="el numero es menor a 99 o mayor a 999";
        if(N>99&&N<1000){
            if(N%10==N/100)
          res="Es capicua";
          
          
      
          else
         res="No es capicua";
        }
    return res;   
    }
}
            