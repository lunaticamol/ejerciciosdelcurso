
public class Ejercicio6{
    
    public String perfectoAbundanteDefectivo(int n){
        String res="";
        if(sumaPropios(n)==n){
        res="Número perfecto";
    }
        else if(sumaPropios(n)>n){
        res=" Número abundante";
    }
        else{
        res="Número defectivo";
    }
        
        return res;
    }
    
    private int sumaPropios(int a){
        int suma=0;
        for(int posibleDiv=1; posibleDiv<=(a/2) ; posibleDiv++){
            if(a%posibleDiv==0){
                suma=suma+posibleDiv;
            }
        }
        return suma;
    }
}
