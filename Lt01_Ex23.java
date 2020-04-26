/*
Objetivo: 23.	Receba 3 valores obrigatoriamente em ordem crescente e 
um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex23
{
public static void main (String args [])
{
    //declaração de variáveis
    Integer valor1, valor2, valor3, valor4; 
     
    //mensagem ao usuário e entrada de dados
   valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira os três primeiros valores em ordem crescente. Insira o primeiro valor:"));
   valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
   valor3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor:"));
   valor4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o quarto valor:"));
   
    
    //calculo e saida de dados
   if(valor1 >= valor2)
   {System.out.println("O segundo valor é igual ou menor que o primeiro.");}
        else if(valor3 >= valor2){
        System.out.println("O terceiro valor é maior ou igual o segundo valor.");
                                 } else if (valor4 < valor1);{
                                                    System.out.println("Os valores em ordem crescente são: "+ valor4+ ", "+ valor1 + ", " + valor2 + " e "+ valor3);
                                                             } else if (valor4 < valor2);{
                                                                                                               System.out.println("Os valores em ordem crescente são: "+ valor1+ ", "+valor4+ ", "+ valor2+ " e "+valor3);
                                                                                                            }
}//fim do void 
}//fim do class
