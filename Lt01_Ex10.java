/*
Objetivo: 10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex10
{
public static void main (String args [])
{
    //declaração de variaveis
    Integer num1, num2, diferença;
    
    //mensagem ao usuário e entrada de dados
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
    
    //calculo da diferença entre os numeros e saida de dados
   if(num1 == num2){
       System.out.println("Os dois numeros são iguais.");
                    }
                    else if(num1>num2){
                diferença = (num1 - num2);
                System.out.println("A diferença entre os dois numeros é: "+diferença);
                        } else if (num1 < num2){
                            diferença = (num2 - num1);{  
                        System.out.println("A diferença entre os dois numeros é: "+diferença);
                        };
                        }//fim do void main
}//fim da classe
}//fim do void
