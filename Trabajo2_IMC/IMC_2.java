import java.util.Scanner;
import java.text.DecimalFormat;

public class IMC_2 {

    public static void main(String[] args) {

        System.out.println("***************************************************************");
        System.out.println("************ CALCULADORA - INDICE DE MASA CORPORAL ************");
        System.out.println("***************************************************************");

        double peso = Double.parseDouble(args[0]);
        double altura = Double.parseDouble(args[1]);
        
        System.out.println("Ingrese su peso en kilogramos: "+ peso);
        System.out.println("Ingrese su altura en metros: "+ altura);

        double imc = calcularMasaCorporal(peso, altura);

        String categoria = obtenerEstado(imc);

        DecimalFormat df=new DecimalFormat("###.00");
        System.out.println("Tu Indice de Masa Corporal es: " + df.format(imc));
        System.out.println("Tu categoria es: " + categoria);
    }

    public static double calcularMasaCorporal(double peso, double altura) {
        return peso / (altura * altura);
    }


    public static String obtenerEstado(double imc) {
        if (imc < 15) {
            return "Delgadez muy severa";
        } else if (imc >= 15 && imc <= 15.99) {
            return "Delgadez severa";
        } else if (imc >= 16 && imc <= 18.49) {
            return "Delgadez";
        } else if (imc >= 18.5 && imc <= 24.99) {
            return "Correcto";
        } else if (imc >= 25 && imc <= 29.99) {
           return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.99) {
            return "Obesidad Moderada";
        } else if (imc >= 35 && imc <= 39.99) {
           return "Obesidad Severa";
        } else {
            return "Obesidad Mórbida";
        }
    }
}
