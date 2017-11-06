
package yomy;

import java.util.*;
import java.io.*;

class Story {


    public static void A(){
    
    // BufferedReader in  = new BufferedReader(new FileReader("file.bruno"));
    // 
    String txt = "";
        String[] a1 = {
            "[ 1 ] Entri nella locanda",
            "[ 2 ] Lasci perdere la locanda e continui il tuo percorso verso un luogo più familiare" };
        String[] a2 = {"meth_1()","meth_2()"};

        System.out.println(txt);

        for (int i = 0; i < a1.length; i++){
            
            System.out.println(a1[i]); //String[]
            }
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        
        int answer =  input.nextInt();
        System.out.println(answer);

        System.out.print("\n\n" + answer + "\n");
    
    
    
    
    }

}