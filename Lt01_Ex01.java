/*
Objetivo: 1. Coletar o valor de um quadrado, calcular sua area e apresentar o resultado.
Programador: Kau� Valentim Greg�rio
Data: 06/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex01
{
public static void main (String args [])
{
    //declara��o de variaveis
    
    int Lado, Area;
    //mensagem ao usu�rio e entrada de dados
    Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado:"));
    
   Area = (Lado * Lado);
   //saida de resultados
   System.out.println("A area �:"+ Area);
}//fim do void main
}//fim da classe