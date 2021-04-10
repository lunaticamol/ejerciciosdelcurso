
public class Ejercicio4
{
    public int factorial(int num){
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i; // resultado = resultado * i;
        }
        
       
        return resultado;
    }
}