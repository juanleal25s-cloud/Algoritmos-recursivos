/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author Arturo
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaR vent = new VistaR();
        vent.setVisible(true);
    }
    
    public double factorial (int n){
        
        if(n==0) return 1;
        else{
            return factorial(n-1)*n;
        }  
}
    
    
}
