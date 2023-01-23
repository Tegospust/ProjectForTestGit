/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//https://youtu.be/UOIPS-ewFHg
package com.ounis.pftg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author AndroidDev
 */
public class ProjectForTestGit {

    public static void printList(List<Integer> aList) {
        for(var i: aList) {
            System.out.print(String.format("%d ", i));
        }
        System.out.println();
    }
    
    public static List<Integer> clearList(List<Integer> L) {
        while(L.size() > 0) {
            L.remove(0);
        }
        return L;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Integer> lst = new ArrayList<Integer>();
        Random rnd = new Random();
        
        var MAX = 30;
        
        var cnt = 0;
        for (;lst.size()<MAX;) {
            var r = rnd.nextInt(MAX + 1) + 1;
            if (lst.indexOf(r) == -1)
                lst.add(r);
            cnt ++;
        }
        System.out.println(String.format("cnt: %d", cnt));
        
        printList(lst);
        System.out.println(String.format("len: %d",lst.size()));
        
        // czyszczenie listy
        lst = clearList(lst);
        System.out.println(lst);
    }
    
}
