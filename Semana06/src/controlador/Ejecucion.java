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
        
    
        
        //jugador1.name="Carlos";
        //jugador1.setName("Fernando Hierro");
        
        //System.out.println(jugador1.name);
        //System.out.println(jugador1.getName());
        
        
        
        //jugador1.name="Leonel Messi";
        jugador1.setName("Leonel Messi");
        jugador2.setName("Cristiano Ronaldo");
        jugador1.setNumber(10);
        jugador2.setNumber(7);
        
        
        jugador1.showInfo();
        
        int contador=jugador1.play();
        System.out.println("Partidos Jugados:"+contador);
        contador=jugador1.play();
        System.out.println("Partidos Jugados:"+contador);
        contador=jugador1.play();
        System.out.println("Partidos Jugados:"+contador);
        contador=jugador1.play();
        System.out.println("Partidos Jugados:"+contador);
        contador=jugador1.play();
        System.out.println("Partidos Jugados:"+contador);
        //jugador2.showInfo();
        
        
        
    }
    
}
