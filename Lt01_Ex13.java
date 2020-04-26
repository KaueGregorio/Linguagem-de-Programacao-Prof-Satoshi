/*
Objetivo: 13.	Receba a quantidade de alimento em quilos. Calcule e mostre quantos 
dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex13
{
public static void main (String args [])
{
    //declaração de variáveis
    Double alimento,  resultado; 
     
    //mensagem ao usuário e entrada de dados
    alimento = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de alimento em Quilos:"));
    
    //calculo e saida de dados
   resultado = (alimento / 0.05);
   
 
       System.out.println("Esra quantidade de comida durará "+ resultado + " dias.");
       
}//fim do void 
}//fim do class
