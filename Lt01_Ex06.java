/*
Objetivo: 7.Receba os valores do comprimento, largura e altura de um paralelep�pedo. 
Calcule e mostre seu volume.
Programador: Kau� Valentim Greg�rio
Data: 06/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex06
{
public static void main (String args [])
{
    //declara��o de vari�veis
    
    int x, y;
    //mensagem ao usuário e entrada de dados
    y = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero X:"));
    x = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero Y:"));
  
   //saida de resultados
   if (x == 0 && y == 0){
       System.out.println("Os valores de X e Y são iguais a zero.");
   }else{
   System.out.println("Os valores de X e Y trocados são X: "+ x + "; e Y: "+ y);
   };
}//fim do void main
}//fim da classe