import java.util.Scanner;
import java.text.DecimalFormat;

public class IMC_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************************************************");
        System.out.println("************ CALCULADORA - INDICE DE MASA CORPORAL ************");
        System.out.println("***************************************************************");
        System.out.println("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

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
        } else if (imc >= 15 && imc <= 15.9) {
            return "Delgadez severa";
        } else if (imc >= 16 && imc <= 18.4) {
            return "Delgadez";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Correcto";
        } else if (imc >= 25 && imc <= 29.9) {
           return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidad Moderada";
        } else if (imc >= 35 && imc <= 39.9) {
           return "Obesidad Severa";
        } else {
            return "Obesidad Mórbida";
        }
    }
}
