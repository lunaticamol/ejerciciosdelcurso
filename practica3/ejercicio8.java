
/**
 * Write a description of class ejercicio8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ejercicio8
{
    public String fechaLiteral(int D,int M, int A){
        String res="";
        if(M==1){
        res=D+" "+"de enero de"+" "+A;
        }
        
        if(M==2){
        res=D+" "+"de febrero de"+" "+A;
        }
        if(M==3){
        res=D+" "+"de marzo de"+" "+A;
        }
        if(M==4){
        res=D+" "+"de abril de"+" "+A;
        }
        if(M==5){
        res=D+" "+"de mayo de"+" "+A;
        }
        if(M==6){
        res=D+" "+"de junio de"+" "+A;
        }
        if(M==7){
        res=D+" "+"de julio de"+" "+A;
        }
        if(M==8){
        res=D+" "+"de agosto de"+" "+A;
        }
        if(M==9){
        res=D+" "+"de septiembre de"+" "+A;
        }
        if(M==10){
        res=D+" "+"de octubre de"+" "+A;
        }
        
        if(M==11){
        res=D+" "+"de noviembre de"+" "+A;
        }
        if(M==12){
        res=D+" "+"de Diciembre de"+" "+A;
        }
        return res;
    }
}