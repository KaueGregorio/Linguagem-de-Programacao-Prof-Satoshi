/*
Objetivo: Receba ao salário de um funcionário e mostre o novo salário com reajuste de 15%.
Programador: Kauê Gregório
Data:06/002/20
*/
import javax.swing.JOptionPane;
public class LT01_Ex02 {
    
public static void main (String args [])
{
    //declaração de variaveis
    
    double Salario, salReajustado;
    //mensagem ao usuário e entrada de dados
    Salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do salário:"));
    
   salReajustado = Salario + (Salario * 0.15);
   //saida de resultados
   System.out.println("O valor do salário reajustado é:"+ salReajustado);
}//fim do void main
}//fim da classe
