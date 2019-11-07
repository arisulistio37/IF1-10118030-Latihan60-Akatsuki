/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan60.akatsuki;

/**
 *
 * @author .
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi program : program ini berisi tentang membuat objek dari anime
 *                     Naruto
 */
public class IF110118030Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cloth = "Black Red Cloud";
        String goal = "Gathering all Jinchuriki";
        
        Anggota deidara = new Anggota("Deidara", "Iwagakure", "Explosive Clay", "S-Rank Missing Ninja", "Explosive Release", "Killed in Battle by Chiyo", true, cloth, goal);
        Anggota sasori = new Anggota("Sasori", "Sunagakure", "Hiruko", "S-Rank Missing Ninja from Sunagakure's Puppet Brigade", "Puppet Mastery", "Killed in Battle by Sakura", true, cloth, goal);
        Anggota kisame = new Anggota("Kisame Hoshigaki", "Kirigakure", "Samehada", "S-Rank Missing Ninja", "Shark-o-mation", "Committed Suicide", true, cloth, goal);
        Anggota itachi = new Anggota("Itachi Uchiha", "Konohagakure", "Kunai", "Anbu Captain Missing Ninja", "Mangekyo Sharingan", "Killed by his own brother", true, cloth, goal);
        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure", "Snakes", "Konohagakure's Legendary Sannin", "Power of White Snake", "Killed & Revived by Sasuke", false, cloth, goal);
        
        System.out.println("Akatsuki Clan");
        System.out.println("=============");
        System.out.println();
        System.out.println("Cloth : " + deidara.getClothes());
        System.out.println("Goal : " + deidara.getGoals());
        System.out.println();
        
        deidara.displayAnggota();
        sasori.displayAnggota();
        kisame.displayAnggota();
        itachi.displayAnggota();
        orochimaru.displayAnggota();
    }
    
}
