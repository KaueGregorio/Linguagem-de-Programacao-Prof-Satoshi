/*
Objetivo: 16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual 
de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas 
x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada 
dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex16
{
public static void main (String args [])
{
    //declaração de variáveis
    Integer horasTraba, numDesc, descendentes;
    Double perDesc, valorHora, desconto, salLiquido, salBruto;
     
    //mensagem ao usuário e entrada de dados
    horasTraba = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas:"));
    valorHora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da hora trabalhada:"));
    perDesc = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto:"));
    numDesc = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de descendentes:"));
    
    //calculo e saida de dados
   salBruto = (horasTraba * valorHora);
   desconto = (perDesc / 100);
   descendentes = (numDesc * 100);
   salLiquido = (salBruto - desconto) + descendentes;
    
   
       System.out.println("O valor do salário liquido é:"+ salLiquido +("Reais"));
       
}//fim do void 
}//fim do class
