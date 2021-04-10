public class Ejercicio10 {
        public String malvadoOdioso(int n){
        String res="";
        if(cont(n)%2==0)
        res="Malvado";
        else
        res="Odioso";
        return res;
}
    private int binario(int n){
        int resultado=0;
        int multi= 1;
        while(n>0){
            int dig= n%2;
            resultado= dig*multi+resultado;
            multi= multi*10;  
            n= n/2;
        }
        return resultado;
    }
    
private int cont(int n){
    int num=binario(n);
   int contar=0;
    while (num>0){
        int dig=num%10;
        if(dig==1)
        contar++;
        num=num/10;
    }
    return contar;
}
}