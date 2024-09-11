/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Advan
 */
public class bingo {
    int repeatCount;
    String replacementText;  
    char[] bingoLetters = {'B', 'I', 'N', 'G', 'O'}; 

    // Konstruktor
    public bingo(int repeatCount, String replacementText) {
        this.repeatCount = repeatCount;
        this.replacementText = replacementText;
    }

    // Method untuk mencetak bagian yang berulang di awal setiap bait
    void printIntro() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
    }

    // Method untuk mencetak baris BINGO dengan menggantikan huruf sesuai jumlah penggantian
    void printBingoLine(int numberOfReplacements) {
        for (int i = 0; i < bingoLetters.length; i++) {
            if (i < numberOfReplacements) {
                System.out.print(replacementText);  
            } else {
                System.out.print(bingoLetters[i]);  
            }
            if (i != bingoLetters.length - 1) {
                System.out.print("-");  
            }
        }
        System.out.println(); 
    }

   
    void printbingoSong() {
        for (int i = 0; i < 6; i++) {  
            printIntro(); 
            for (int j = 0; j < repeatCount; j++) { 
                printBingoLine(i);
            }
            System.out.println("And Bingo was his name-o.\n"); 
        }
    }
}
