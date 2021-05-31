/**
 * Use los comentarios para explicar el objetivo de este programa 
 *
 * @author Bryan Adrian Delgado Sepúlveda | bryanadriands@ufps.edu.co
 * @version 1.0       Fecha:29-04-2021
 */
class Main
{
    public static void main(String [] args)

    {
        //Crear objeto del modelo
        SumaAYB s = new SumaAYB();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        s.a = c.leerLong("A");
        s.b = c.leerLong("B");
        
        //invocar el algoritmo o los algoritmos, usando el Modelo
        s.algoritmo();
        //mostrar / imprimir los datos de salida
        
        c.imprimir("La suma entre "  +s.a  + " y " + s.b + " es: "+ s.suma);
 
    }   
}