/*
Objetivo: 21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a m�dia aritm�tica. 
Mostre a mensagem de acordo com a m�dia:
a.	Se a m�dia for >= 6,0 exibir �APROVADO�;
b.	Se a m�dia for >= 3,0 ou < 6,0 exibir �EXAME�;
c.	Se a m�dia for < 3,0 exibir �RETIDO�.

Programador: Kau� Valentim Greg�rio
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex21
{
public static void main (String args [])
{
    //declara��o de vari�veis
    Double nota1, nota2, resultado, nota3, nota4; 
     
    //mensagem ao usu�rio e entrada de dados
   nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota:"));
   nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota:"));
    nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota:"));
    nota4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a quarta nota:"));
    
    //calculo e saida de dados
   resultado = ((nota1 + nota2 + nota3 + nota4)/4);
   
   if(resultado >= 6.0)
   {System.out.println("APROVADO");}
        else if (resultado >= 3.0 && resultado < 6.0)
        {
        System.out.println("EXAME");
        }else
            {
            System.out.println("REPROVADO");
            }
       
}//fim do void 
}//fim do class
