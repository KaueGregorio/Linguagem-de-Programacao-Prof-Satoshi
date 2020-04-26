/*
objetivo: 20.	Receba 3 coeficientes A, B, e C de uma equação do 2Âº grau da formula AXÂ²+BX+C=0.
Verifique e mostre a existencia de raizes reais e se caso exista, calcule e mostre.
Programador: Kaue Valentim Gregorio
 */
import javax.swing.JOptionPane;
public class Ex20 {
    public static void main(String args []){
    //declaração de variaveis
        int coefA, coefB, termoIndep, delta;
        double resultado, raizDelta, resX1, resX2;
        
    //solicita a inserção dos numeros coeficentes
    coefA = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente A:"));
    coefB = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente B:"));
    termoIndep = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente C:"));
    
    //calculo Delta    
        delta = (coefB * coefB)- 4 * (coefA * termoIndep);
        System.out.print("O valor de Delta é: "+delta+(" "));
    
    //Calcula a raiz quadrada de Delta
        raizDelta = Math.sqrt(delta);
        System.out.print("e a raiz quadrada de Delta é: "+("."));
    
    //Calcula os valores das raizes da equação
        resX1 = ((- coefB + raizDelta) / (2 * coefA));
        resX2 = ((- coefB - raizDelta) / (2 * coefA));
        
    //mostra os valores das duas raizes da equação
        if (delta < 0){
        System.out.println("Delta é menor que zero então não existem raizes reais.");
            }else{
                if(delta == 0){
                resX1 = (-coefB - raizDelta)/ (2 * coefA);
                System.out.println("Delta é igual a zero então as raizes reais são iguais a "+ resX1+("."));
                }else{
                      if(delta > 0){
                      System.out.print("Os valores das raizes são: "+ resX1+ (" e ")+ resX2+("."));    
                      }  
                }
        }
        
        
    }//fecha main
}//fecha class