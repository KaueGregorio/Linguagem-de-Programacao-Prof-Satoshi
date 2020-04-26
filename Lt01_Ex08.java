/*
Objetivo: 8.	Receba o valor de um depósito em poupança. Calcule e mostre o valor 
após 1 mês de aplicação sabendo que rende 1,3% a. m.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex08
{
public static void main (String args [])
{
    //declaração de variaveis
    Double poup, renda;
    
    //mensagem ao usuário e entrada de dados
    poup = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
    
   renda = poup+(poup * 0.013);
   
   //saida de resultados
   System.out.println("O valor da poupança com a renda de 1,3% somada é:"+ renda);
}//fim do void main
}//fim da classe