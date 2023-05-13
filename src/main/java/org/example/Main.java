package org.example;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {

        Integer opcion = menu();

        switch (opcion){
            case 1:
                multiplicacion();
                break;
            case 2:
                sumar();
                break;
            case 3:
                restar();
                break;
            case 4:
                dividir();
                break;
            case 5:
                contador();
                break;
            case 6:
                directorio();
        }


/*        if (opcion == 1) {
            multiplicacion();
        } else if (opcion == 2) {
            sumar();
        } else if (opcion == 3) {
            restar();
        } else if (opcion == 4) {
            dividir();
        } else if(opcion == 5 ){
            contador();
        }*/
        

        System.out.println("Fin de ejecucion");

    }

    public static Integer menu() {
        System.out.println("Elige una opcion:");
        System.out.println("1. Multiplicacion");
        System.out.println("2. Suma");
        System.out.println("3. resta");
        System.out.println("4. dividir");
        System.out.println("5. Contador");
        System.out.println("6. Directorio");
        return teclado.nextInt();
    }

    public static void multiplicacion() {
        System.out.println("Dime el primer numero:");
        Integer primerNumero = teclado.nextInt();
        System.out.println("Dime el segundo numero:");
        Integer segundoNumero = teclado.nextInt();
        //System.out.println("El resultado es : "+ primerNumero * segundoNumero);
        mostrarResultado(primerNumero, segundoNumero, 0);
    }

    public static void sumar() {
        System.out.println("Dime el primer numero:");
        Integer primerNumero = teclado.nextInt();
        System.out.println("Dime el segundo numero:");
        Integer segundoNumero = teclado.nextInt();
        //System.out.println("El resultado es : " + (primerNumero + segundoNumero));
        mostrarResultado(primerNumero, segundoNumero, 1);
    }

    public static void restar() {
        System.out.println("");
        System.out.println("Dime el primer numero");
        Integer primerNumero = teclado.nextInt();
        System.out.println("Dime el segundo numero");
        Integer segundoNumero = teclado.nextInt();
        //System.out.println("El resultado es : " + (primerNumero - segundoNumero));
        mostrarResultado(primerNumero, segundoNumero, 2);

    }

    public static void dividir() {
        System.out.println("");
        System.out.println("Dime el primer numero");
        Integer primerNumero = teclado.nextInt();
        System.out.println("Dime el segundo numero");
        Integer segundoNumero = teclado.nextInt();
       // System.out.println("El resultado es : " + (primerNumero / segundoNumero));
        mostrarResultado(primerNumero, segundoNumero, 3);
    }
    public static void contador() {
        System.out.println("");
        System.out.println("Hasta donde dices que cuente");
        Integer primerNUmero = teclado.nextInt();
        for(int i = 0; i<= primerNUmero; i++){
            System.out.println("Voy por el numero: "+i);
        }
    }

    public static void mostrarResultado(Integer primerNumero, Integer segundoNumero, Integer operacion) {
        //Multiplicar
   System.out.print("El resultado es: ");

        if (operacion == 0) {
            System.out.println( (primerNumero * segundoNumero));
        }
        //Sumar
        if (operacion == 1) {
            System.out.println((primerNumero + segundoNumero));
        }
        //Restar
        if (operacion == 2) {
            System.out.println(primerNumero - segundoNumero);

        }//Dividir
        if (operacion == 3) {
            System.out.println((primerNumero / segundoNumero));
        }
        //System.out.println("El resultado es : "+ (primerNumero * segundoNumero));

    }

    public static void directorio(){
        File file = new File("/home/thepuar");
        List<String> ficheros = Arrays.asList(file.list());

        for(String fichero: ficheros ){
            System.out.println(fichero);
        }
    }


}
