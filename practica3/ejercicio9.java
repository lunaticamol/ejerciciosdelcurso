

public class ejercicio9
{
    public String esBisiesto(int A){
        String res;
        if(A%4==0){
        if (A%100==0){
            
            res="no es bisiesto";
        }
          else if(A%4==0&&A%100!=0){
              res="es bisiesto";
            }
            
                else if(A%4==0&&A%400==0){
                    res="es bisiesto";
                }
                else{
                    res="no es bisiesto";
                }
            }
            else{
                
               res="no es bisiesto";
            }
                   
                 
            return res;
        }
    }