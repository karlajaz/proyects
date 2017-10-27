
package Tikect;

import javax.swing.JOptionPane;

public class Principal {
   
    public static void main(String[] args) {
        
        Lista popo = new Lista();
        
        int opc;
        String pro;
        int pre;
        do {
            opc=Integer.parseInt(JOptionPane.showInputDialog("Menu\n ¿Que deseas realizar? \n 1= Insertar \n 2= Mostar \n 3 =Salir "));
            if (opc==1) {
                pro=JOptionPane.showInputDialog("Ingresa el nombre del producto");
                popo.insertarInicioSS(pro);
                pre=Integer.parseInt(JOptionPane.showInputDialog("Ingresa precio el precio del producto"));
                popo.insertarInicioII(pre);
            }
            if (opc==2) {
                popo.mostrarListaDEFINITIVAPRO();
            }
            if (opc==3) {
                popo.mensaje();
                
            }
        } while (opc!=3);
        
        
    }
    
}
