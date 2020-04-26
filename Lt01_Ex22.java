/*
Objetivo: 22.	Receba 2 valores inteiros e diferentes. 
Mostre seus valores em ordem crescente.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex22
{
public static void main (String args [])
{
    //declaração de variáveis
    Integer valor1, valor2; 
     
    //mensagem ao usuário e entrada de dados
   valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
   valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
   
    
    //calculo e saida de dados
   if(valor1 > valor2)
   {System.out.println("Em ordem crescente os valores ficam"+ valor2 + " e "+valor1);}
        else 
        {
        System.out.println("Em ordem crescente os valores ficam "+ valor1 + " e "+valor2);
        }
}//fim do void 
}//fim do class
