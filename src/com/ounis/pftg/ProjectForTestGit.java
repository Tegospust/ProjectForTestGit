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
        
        for (;lst.size()<21;) {
            var r = rnd.nextInt(30) + 1;
            if (lst.indexOf(r) == -1)
                lst.add(r);
        }
        
        printList(lst);
        
        // czyszczenie listy
        lst = clearList(lst);
        System.out.println(lst);
    }
    
}
