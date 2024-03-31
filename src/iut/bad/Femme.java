/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

/**
 *
 * @author Kiady
 */
public class Femme extends Humain{

    public Femme(String doe, String alice, int par) {
    }
    public static void main(String[] args){
        Femme femme = new Femme("Doe", "Alice", 30);
        Homme homme = new Homme("Smith", "John", 35);
        femme.ami(homme);
    }
}
