/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

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
        
        graf.tambahSisi("jar", "komdat");
        graf.tambahSisi("jar", "analgor");
        
        graf.tambahSisi("komdat", "sisdig");
        graf.tambahSisi("komdat", "matdas");
        graf.tambahSisi("komdat", "matdis");
        
        graf.tambahSisi("analgor", "matdis");
        graf.tambahSisi("analgor", "matdas");
        graf.tambahSisi("analgor", "sda");
        
        graf.tambahSisi("sda", "ddp");
        
        graf.tambahSisi("pc", "analgor");
        
        graf.tambahSisi("se", "analgor");
        
        TopologicalSort.topologicalSort(graf, "jar");
//        TopologicalSort.topologicalSort(graf, "matdas");
//        TopologicalSort.topologicalSort(graf, "analgor");
    }
    
}
