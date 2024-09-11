/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author Advan
 */
public class Matematikaberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        matematika mtk = new matematika();
        
        System.out.println("pertambahan 20+10=" + mtk.pertambahan(20, 10));
        System.out.println("pengurangan 10-5="  + mtk.pengurangan(10, 5));
        System.out.println("Perkalian   10*3="  + mtk.perkalian(10, 3));
        System.out.println("Pembagian   21/2=" +  mtk.pembagian(20, 2));
    }
    
}
