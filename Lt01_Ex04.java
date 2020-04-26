/*
Objetivo: 4.	Receba a temperatura em graus Celsius. Calcule e mostre a sua 
temperatura convertida em fahrenheit F = (9*C+160) /5.
Programador: Kauê Gregório
Data:06/02/20
*/
import javax.swing.JOptionPane;
public class Lt01_Ex04 {
    
public static void main (String args [])
{
    //declaração de variaveis
    
    double celsius, fahrenheit;
    //mensagem ao usuário e entrada de dados
    celsius = Integer.parseInt(JOptionPane.showInputDialog("Insira a temperatura em graus celsius:"));
    
   //calculo da area do triangulo
    fahrenheit = (celsius * 9)/5+32;
   //saida de resultados
   System.out.println("A temperatura em graus Fahrenheit é:"+ fahrenheit);
}//fim do void main
}//fim da classe
