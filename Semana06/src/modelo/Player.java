/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kepb
 */
public class Player {
    private String name;
    private int number;
    private int age;
    private double salary;
    private String nameClub;

    
    // los metodos void no devuelven nada 
    public void showInfo(){
        System.out.println("-------------------------");
        System.out.println("Datos Jugador");
        System.out.println("-------------------------");
        System.out.println("Nombre: "+name);
        System.out.println("Dorsal: "+number);
        System.out.println("Edad: "+age);
        System.out.println("Salario: "+salary);
        System.out.println("Club actual: "+nameClub);
        System.out.println("-------------------------");
    }
    
    // metodo que deuvelve valor 
    public int play(){
        int numeroPartidos;
        numeroPartidos=100;
        return numeroPartidos;
    }
    
    /**
     * @return the nombre
     */
    public String getName() {
        return name;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setName(String nombre) {
        this.name = nombre;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the nameClub
     */
    public String getNameClub() {
        return nameClub;
    }

    /**
     * @param nameClub the nameClub to set
     */
    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }
    
    
    
}
