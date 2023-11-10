/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lirefichier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class LireFichier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        LireFichier t = new LireFichier();
        
    }
    public LireFichier() throws IOException{
        try{
            BufferedReader input = new BufferedReader(new FileReader("coucou.txt"));
            String chaine="";
            while(!(chaine=input.readLine()).equalsIgnoreCase("EOF")){
                StringTokenizer str = new StringTokenizer(chaine);
                while(str.hasMoreTokens()){
                    System.out.println(str.nextToken());
                }                
            }
            input.close();

        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
    }
}
