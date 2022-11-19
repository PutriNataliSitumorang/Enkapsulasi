/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author TOSHIBA
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
             Persegi p = new Persegi(); 
             p.Panjang(7);
             p.setlebar(6);
    
    System.out.println("Panjang:"+p.getPanjang());
    System.out.println("Lebar:"+p.getLebar());
    System.out.println("Luas persegi:"+p.getLuas());
    
}

} 





