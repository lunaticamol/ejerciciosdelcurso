
/**
 * Write a description of class insomnio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class insomnio
{
    public int calcularTiempo(){
        int horaDurmio=2;
        int minDurmio=45;
        int horaDeperto=11;
        int minDesperto=25;
        
        int horaDurmioMin=horaDurmio*60+minDurmio;
        int horaDepertoMin=horaDeperto*60+minDesperto;
         int res=horaDepertoMin-horaDurmioMin;
         return res;
        }}
        
        