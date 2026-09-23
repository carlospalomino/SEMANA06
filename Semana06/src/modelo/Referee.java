/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kepb
 */
public class Referee {
    private String name;
    private int games;

    public void showInfo(){
        System.out.println("Nombre: "+name);
        System.out.println("Nro games: "+games);
    }
    
    public int totalGames(){
        games=games+1;
        return games;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the games
     */
    public int getGames() {
        return games;
    }

    /**
     * @param games the games to set
     */
    public void setGames(int games) {
        this.games = games;
    }
    
    
    
    
}
