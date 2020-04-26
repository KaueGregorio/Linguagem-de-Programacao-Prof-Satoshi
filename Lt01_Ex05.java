/*Objetivo: 05. Receba os coeficientes de A,B,C de uma equação de segundo grau(AX²+BX+C=0). 
Calcule e mostre as raizes reais (considerar que a equação possui duas raizes).
programador: Kauê Valentim Gregório
 */
import javax.swing.JOptionPane;
public class Ex05 {
    public static void main (String args []){
    int a, b, c, delta;
    Double raizQuad, raiz1, raiz2;
    
    a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente A:"));
    b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente B:"));
    c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente C:"));
    delta = (b * b)-4 *(a * c);
    System.out.print("O valor de delta é:"+delta+(" "));
    
    raizQuad = Math.sqrt(delta);
    
    raiz1 = (- b + raizQuad) / (2 * a);
    raiz2 = (- b - raizQuad) / (2 * a);
    
    System.out.print("As duas raizes são: "+ raiz1 +(" e ")+ raiz2);
    }
}
