package com.company;


 public class main {

    public static void main(String args []) {
        // crea una función con 3 parametros con números que se sumen entre sí
        suma(5, 10, 15);

        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println ("numero de puertas:" + miCoche.puertas);

    }

    public static int suma(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println (resultado);
       return a + b + c;
    }
}
  class Coche {
    public int puertas = 2;
    public void SumarPuertas() {
        this.puertas++;
    }

}