/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;
import modelo.Player;
/**
 *
 * @author kepb
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player jugador1=new Player();
        Player jugador2=new Player();
        
        jugador1.setName("Leonel Messi");
        jugador2.setName("Cristiano Ronaldo");
        jugador1.setNumber(10);
        jugador2.setNumber(7);
        
        
        jugador1.showInfo();
        jugador2.showInfo();
        
        
        
    }
    
}
