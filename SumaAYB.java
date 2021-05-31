/**
 * Use los comentarios para explicar el objetivo de este programa 
 *
 * @author Bryan Adrian Delgado Sepúlveda | bryanadriands@ufps.edu.co
 * @version 1.0       Fecha:29-04-2021
 */
public class SumaAYB
{
    //entradas
    long a;
    long b;
    //salidas
    long suma;

    //Ingresar algoritmo
    long i=0;
    void algoritmo()
    {
        //for(long i=a; i<=b; i++)
        //suma= suma + i;
        if(a>b){
        i=a;
        a=b;
        b=i;
        }
        i=a;
        while(i<=b){

        suma= suma + i;
        i++;
        }
    }  
}
