/*
Objetivo: 19.	Receba 2 valores reais. Calcule e mostre o maior deles.
Programador: Kau� Valentim Greg�rio 
Data:13/02/20
*/
import javax.swing.JOptionPane;
public class Lt01_Ex19 {
    
public static void main (String args [])
{
    //declara��o de vari�veis.
    Integer val1, val2;
    
    //mensagem ao usu�rio e entrada de dados
    val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
    val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
   
    //Calculo dos valores e saida de dado
     if(val1 > val2){    
        System.out.println("O maior valor �:"+ val1);   
       }
        else
        {
         (val1 < val2){
            
              System.out.println("O maior valor �:"+ val2);   
            };
            if (val1 == val2)
                {
                System.out.println("Os dois valores s�o iguais.");   
                }
        }   
}//fim do void main
}//fim da classe


