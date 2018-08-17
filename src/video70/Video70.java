/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video70;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

/**
 *
 * @author gleez
 */
public class Video70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoEstado mimarco = new MarcoEstado(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEstado extends JFrame{
    public MarcoEstado(){
        setVisible(true); 
        setBounds(300,300,500,350); 
        CambiaEstado nuevo_estado = new CambiaEstado(); 
        addWindowStateListener(nuevo_estado); 
    }
}

class CambiaEstado implements WindowStateListener{
    
    public void windowStateChanged(WindowEvent e){
        System.out.println("La ventana ha cambiado de estado ");
       // System.out.println(e.getNewState());
       
       if(e.getNewState()==Frame.MAXIMIZED_BOTH){
           System.out.println("La Ventana esta a pantalla completa");
       }else if (e.getNewState()==Frame.NORMAL){
           System.out.println("La ventana esta normal"); 
       }else if (e.getNewState()==Frame.ICONIFIED){
           System.out.println("La ventana esta minimisada"); 
       }
           
       
    }
    
    
}


