// Realizar un programa que calcule e informe el INDICE DE MASA MUSCULAR en base a los siguientes valores:
// menor a 15 diga "Delgadez muy severa"
// entre 15 y 15,9 diga "Delgadez severa"
// entre 16 y 18,4 diga "Delgadez"
// entre 18.5 y 24,9 diga "Correcto"
// entre 25 y 29,9 diga "Sobrepeso"
// entre 30 y 34,9 diga "Obesidad Moderada"
// entre 35 y 39,9 diga "Obesidad Severa"
// mayor a 40 diga "Obesidad Mórbida"



import java.util.Scanner;
import java.text.DecimalFormat;

public class IMC_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        String categoria;
        if (imc < 15) {
            categoria = "Bajo Peso";
        } else if (imc >= 15 && imc <= 15.9) {
            categoria = "Delgadez muy severa";
        } else if (imc >= 16 && imc <= 18.4) {
            categoria = "Delgadez";
        } else if (imc >= 18.5 && imc <= 24.9) {
            categoria = "Correcto";
        } else if (imc >= 25 && imc <= 29.9) {
            categoria = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            categoria = "Obesidad Moderada";
        } else if (imc >= 35 && imc <= 39.9) {
            categoria = "Obesidad Severa";
        } else {
            categoria = "Obesidad Mórbida";
        }

        DecimalFormat df=new DecimalFormat("###.00");
        System.out.println("Tu IMC es: " + (df.format(imc)));
        System.out.println("Tu categoria es: " + categoria);
    }
}
