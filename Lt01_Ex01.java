/*
Objetivo: 1. Coletar o valor de um quadrado, calcular sua area e apresentar o resultado.
Programador: Kauê Valentim Gregório
Data: 06/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex01
{
public static void main (String args [])
{
    //declaração de variaveis
    
    int Lado, Area;
    //mensagem ao usuário e entrada de dados
    Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado:"));
    
   Area = (Lado * Lado);
   //saida de resultados
   System.out.println("A area é:"+ Area);
}//fim do void main
}//fim da classe