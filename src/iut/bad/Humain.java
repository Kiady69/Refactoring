/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

/**
 *
 * @author Kiady
 */
public class Humain {
    private String nom;
    private String prenom;
    private int age;
    
    public Humain(){
        
    }
    
    public Humain(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void details() {
        System.out.println(toString());
    }
    
    public void manger(){
        System.out.println("Je mange.");
    }
    
    public void boire(){
        System.out.println("Je bois");
    }
    
    @Override
    public String toString() {
        return "Humain{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
