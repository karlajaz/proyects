
package Tikect;

import javax.swing.JOptionPane;

public class NodoI {
      public int datoI;
   
   public NodoI nodoISig;
 
   
   public NodoI(int d){
       this.datoI=d;  
   }
   public NodoI(int d,NodoI n){
       datoI=d;
       nodoISig=n;
   }
   public void Jaja(){
       JOptionPane.showMessageDialog(null,":)");
   }
}
