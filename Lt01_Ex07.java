/*
Objetivo: 7.Receba os valores do comprimento, largura e altura de um paralelepípedo. 
Calcule e mostre seu volume.
Programador: Kauê Valentim Gregório
Data: 06/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex07
{
public static void main (String args [])
{
    //declaração de variáveis
    Integer comprimento, largura, altura, volume;
    
    //mensagem ao usuário e entrada de dados
    comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo em centimetros:"));
    largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura do paralelepípedo em centimetros:"));
    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do paralelepípedo em centimetros:"));
  
   //saida de resultados
   
   volume = ((comprimento * largura)* altura); 
   System.out.println("Os volume do paralelepípedo é: "+ volume+ " centimetros");


}//fim do void main
}//fim da classe