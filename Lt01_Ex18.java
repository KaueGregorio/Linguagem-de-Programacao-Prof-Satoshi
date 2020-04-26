/*
Objetivo: 18.	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior 
pelo menos valor.
Programador: Kau� Valentim Greg�rio
Data:13/02/20
*/
import javax.swing.JOptionPane;
public class Lt01_Ex18 {
    
public static void main (String args [])
{
    //declaração de variáveis.
    Integer x, y, d;
    
    //mensagem ao usuário e entrada de dados
    x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
    y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
   
    //Calculo dos valores
    if(x == y)
    {
     d = 0;  
    }   else
        {
        if(x > y)
        d = (x - y);
        else
            {
            d = (y-x);
            }
        }
       //Saida de dados. 
       if (x == y) 
       {   
       System.out.println("O primeiro e o segundo valor são iguais.");   
        }
       else
            {
               if(x > y)    
               System.out.println("A diferença entre o primeiro e o segundo valor é:"+ d);   
                    else
                   System.out.println("A diferença entre o segundo e o primeiro valor é:"+ d);   
                   }   
}//fim do void main
}//fim da classe
