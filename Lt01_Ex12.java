/*
Objetivo: 12.	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade 
e quantos anos terá daqui a 17 anos.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex12
{
public static void main (String args [])
{
    //declaração de variáveis
    Integer anodeNascimento, anoAtual, resultado, resultado2; 
     
    //mensagem ao usuÃ¡rio e entrada de dados
    anodeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de seu nascimento:"));
    anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual:"));
    
    //calculo e saida de dados
   resultado = (anoAtual - anodeNascimento);
   resultado2 = (resultado + 17);
       System.out.println("Você tem "+ resultado +" anos de idade e daqui a dezessete anos você terá "+ resultado2 + " anos de idade.");
       
}//fim do void 
}//fim do class
