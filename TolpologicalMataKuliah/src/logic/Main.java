/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graf graf = new Graf();
        graf.tambahSimpul("jar");
        graf.tambahSimpul("komdat");
        graf.tambahSimpul("sisdig");
        graf.tambahSimpul("matdis");
        graf.tambahSimpul("matdas");
        graf.tambahSimpul("analgor");
        graf.tambahSimpul("ddp");
        graf.tambahSimpul("sda");
        graf.tambahSimpul("pc");
        graf.tambahSimpul("se");
        
        //untuk mengambil matkul jar, harus menyelesaikan matkul komdat terlebih dahulu
        graf.tambahSisi("jar", "komdat");
        //untuk mengambil matkul jar, harus menyelesaikan matkul analgor terlebih dahulu
        graf.tambahSisi("jar", "analgor");
        //untuk mengambil matkul komdat, harus menyelesaikan matkul sisdig terlebih dahulu
        graf.tambahSisi("komdat", "sisdig");
        //untuk mengambil matkul komdat, harus menyelesaikan matkul matdas terlebih dahulu
        graf.tambahSisi("komdat", "matdas");
        //untuk mengambil matkul komdat, harus menyelesaikan matkul matdis terlebih dahulu
        graf.tambahSisi("komdat", "matdis");
        //dan seterusnya
        graf.tambahSisi("analgor", "matdis");
        graf.tambahSisi("analgor", "sda");
        graf.tambahSisi("sda", "ddp");
        graf.tambahSisi("pc", "analgor");
        graf.tambahSisi("se", "analgor");
        
        Scanner input = new Scanner(System.in);
        String matkul;
        while(true){
            System.out.println("__________________\nAmbil matkul");
            System.out.print("Masukan matkul yang mau diambil : ");
            matkul = input.nextLine();
            if(graf.mapNamaIndeks.get(matkul) == null){
                System.out.println("input salah");
                continue;
            }
            System.out.println("__________________\nUrutan matkul yang harus diambil : ");
            TopologicalSort.topologicalSort(graf, matkul);
            System.out.println();
        }
    }
}
