/*
Objetivo: 14.	14.	Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex14
{
public static void main (String args [])
{
    //declaração de variáveis
    Integer ang1, ang2, ang3; 
     
    //mensagem ao usuário e entrada de dados
    ang1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro angulo:"));
    ang2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo angulo:"));
   
    
    //calculo e saida de dados
   ang3 = 180 - (ang1 + ang2) ;
       System.out.println("O valor do terceiro é:"+ang3 +("Graus"));
       
}//fim do void 
}//fim do class
