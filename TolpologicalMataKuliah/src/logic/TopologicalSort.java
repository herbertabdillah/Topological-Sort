/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.*;

/**
 *
 * @author Lenovo
 */
public class TopologicalSort {
    static ArrayList<LinkedList<Integer>> simpul;
    static HashMap<String, Integer> mapNamaIndeks;
    static ArrayList<String> namaSimpul;
    static Boolean[] apakahSudahDikunjungi;
    public static void topologicalSort(Graf graf, String tujuan){
        simpul = graf.simpul;
        mapNamaIndeks = graf.mapNamaIndeks;
        namaSimpul = graf.namaSimpul;
        int indexTujuan = mapNamaIndeks.get(tujuan);
        apakahSudahDikunjungi = new Boolean[simpul.size()];
        for(int i = 0; i < simpul.size(); i++){
            apakahSudahDikunjungi[i] = false;
        }
        proses(indexTujuan);
        
    }
    public static void proses(int index){
        if(apakahSudahDikunjungi[index]) return;
        Iterator<Integer> it = simpul.get(index).iterator();
        apakahSudahDikunjungi[index] = true;
        while(it.hasNext()){
            proses(it.next());
        }
        System.out.print(namaSimpul.get(index) + ", ");
    }
}
