/*
Objetivo: 11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex11
{
public static void main (String args [])
{
    //declaração de variáveis
    Double raio, cumprimento, pi; 
     
    //mensagem ao usuÃ¡rio e entrada de dados
    raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio da cincunferência em centimentros:"));
    pi = 3.14;
    
    //calculo e saida de dados
   cumprimento = ((2 * pi)*raio);
       System.out.println("O comprimento da circunferência é:"+cumprimento +("cm"));
       
}//fim do void 
}//fim do class
