/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6hashmap;

import java.util.HashMap;

/**
 *
 * @author gruiztal
 */
public class Mapa {
    HashMap<Integer, String> phoneBook= new HashMap<>();
    
    String n1 = "paco";
    String n2 = "Marta";
    int num1 = 123456789;
    int num2 = 394857485;
    
    public void mostrarContactos(){
        phoneBook.put(num1, n1);
        phoneBook.put(num2, n2);
        phoneBook.put(74784994, "juanito");
        System.out.println(phoneBook);
    }
    public void buscar(int num){
        
        System.out.println("El numero "+num+" Pertenece a "+phoneBook.get(num));
        
    
    }
}
