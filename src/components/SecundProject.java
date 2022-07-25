Nopackage br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        //Adicionando as temperaturas na lista:

int count = 0;

while (true) {
If (count == 6) breack;
System.out.print("Digite a temperatura: ");
double temp = scan.nextDouble();
temperaturas.add(temp);
count++
}

System.out.println("-------------------");

// Exibindo todas as temperaturas

System.out.println("Todas as temperaturas: ");
temperaturas

