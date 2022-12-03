 
  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
public class Nilai {
    
    private int Nilaipraktek;
    private int Nilaiteori;
    
    
    private int getNilaipraktek(){
         return Nilaipraktek;
         
    } 
    
         private void setNilaipraktek (int Nilaipraktek) {
              this.Nilaipraktek =Nilaipraktek;
         }
         
         
    private int getNilaiteori(){
        return Nilaiteori;
    }
    
    private void setNilaiteori(int Nilaiteori) {
       this.Nilaiteori=Nilaiteori;
       
    }
    
    public Nilai (){
         int Nilaipraktek =0;
         int Nilaiteori =0;
    }
    
    public int Nilai(int np, int nt){
        return (np+nt/2);
    }
    
    public int Nilaiakhir(int Nilai_praktek,int Nilai_teori){
        return Nilaipraktek+Nilaiteori/2;
         }
    
}

