/*
Objetivo: 17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que 
o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Programador: Kauê Valentim Gregório
Data: 02/02/2020
*/
import javax.swing.JOptionPane;
public class Lt01_Ex17
{
public static void main (String args [])
{
    //declaração de variáveis
    int x = 12;
    Double tempo, velMedia, litros;
     
    //mensagem ao usuário e entrada de dados
    tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo do percurso:"));
    velMedia = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade média:"));
    
    //calculo e saida de dados
   litros = (tempo * velMedia)/ x;
    
   
       System.out.println("A quantidade de litros utilizados nesta viagem é:"+ litros);
       
}//fim do void 
}//fim do class
