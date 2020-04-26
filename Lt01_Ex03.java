/*
Objetivo: Receba a base e a altura do triangulo e calcule sua area.
Programador: Kauê Gregório
Data:06/02/20
*/
import javax.swing.JOptionPane;
public class Lt01_Ex03 {
    
public static void main (String args [])
{
    //declaração de variaveis
    
    double base, altura, area;
    //mensagem ao usuário e entrada de dados
    base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triagulo:"));
    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o altura do triagulo:"));
   //calculo da area do triangulo
    area = (base * altura) / 2;
   //saida de resultados
   System.out.println("A area do triangulo é:"+ area);
}//fim do void main
}//fim da classe
