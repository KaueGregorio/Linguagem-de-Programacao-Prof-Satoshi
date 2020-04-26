/*
Objetivo: 7.Receba os valores do comprimento, largura e altura de um paralelepípedo. 
Calcule e mostre seu volume.
Programador: Kauê Valentim Gregório
Data: 06/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex06
{
public static void main (String args [])
{
    //declaração de variáveis
    
    int x, y;
    //mensagem ao usuÃ¡rio e entrada de dados
    y = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero X:"));
    x = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero Y:"));
  
   //saida de resultados
   if (x == 0 && y == 0){
       System.out.println("Os valores de X e Y sÃ£o iguais a zero.");
   }else{
   System.out.println("Os valores de X e Y trocados sÃ£o X: "+ x + "; e Y: "+ y);
   };
}//fim do void main
}//fim da classe