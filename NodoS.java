
package Tikect;

public class NodoS {
      public String datoS;
   
   public NodoS nodoSSig;
 
   
   public NodoS(String d){
       this.datoS=d;  
   }
   public NodoS(String d,NodoS n){
       datoS=d;
       nodoSSig=n;
   }
}
