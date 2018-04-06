/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaleafs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ma.kowalski
 */
public class JavaLeafs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tree tree = new Tree();        
       
        List<Branch> branches = new ArrayList<Branch>();
        
        for (int i = 0; i < 100; i++) {
          branches.add(new Branch());
            System.out.println("dodałem brancha " + i);
        }        
        tree.branches = branches;
        //--------------\\
        
       for (int i = 0; i < tree.branches.size(); i++) {
           
            List<Leaf> liscie = new ArrayList<Leaf>();
            
            for (int j = 0; j < 100; j++) {
                
                Leaf l = new Leaf((Double)Math.random());
                liscie.add(l);
                System.out.println("dodałem liścia do brancha "+i
                +" [waga = "+ l.getWaga()+" ]");
            }            
            Branch br = tree.branches.get(i);
            br.leafs = liscie;    
            
        }
       
       System.out.println(Tree.countW(tree));
        
    }
    
}
