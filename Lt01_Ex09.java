/*
Objetivo: 9.Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
Programador: Kauê Valentim Gregório Receba
Data:13/02/20
*/
import javax.swing.JOptionPane;
public class Lt01_Ex09 {
    
public static void main (String args [])
{
    //declaração de variáveis.
    Integer num1, num1Quadrado, num2, num2Quadrado, resultado ;
    
    //mensagem ao usuário e entrada de dados
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
   
    //Calculo dos valores
    num1Quadrado = (num1 * num1);
    num2Quadrado = (num2 * num2);
    resultado = (num1Quadrado + num2Quadrado);
    
      //Saida de dados
      System.out.println("A soma dos quadrados dos dois numeros é:"+ resultado);
}//fim do void main
}//fim da classe
