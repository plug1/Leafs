/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaleafs;

import java.util.List;

/**
 *
 * @author ma.kowalski
 */
public class Tree {
    
    public List<Branch> branches;
    
    public static Double countW(Tree tr){
        
        Double result=0d;
        
        List<Branch> br = tr.branches;
        
        for (int i = 0; i < br.size(); i++) {
            
            Branch branch= br.get(i);
            List<Leaf> ll = branch.leafs;
            
            for (int j = 0; j < ll.size(); j++) {
                
                Leaf l = ll.get(j);
                result = result +l.getWaga();
            }
            
        }
        
        
        return result;
    }
}
