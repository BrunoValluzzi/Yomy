
package yomy;

import java.util.*;
import java.io.*;

class Story {
    
    public static Tools t = new Tools();

        public static void A(){
            
            t.creaTesto("Inizio.txt");
            
            String[] a1 = {
                "[ 1 ] Entri nella locanda",
                "[ 2 ] Lasci perdere la locanda e continui il tuo percorso verso un luogo più familiare" };
        
            System.out.println(t.creaTesto("Inizio.txt"));
            System.out.println("\n");

            for (int i = 0; i < a1.length; i++){
                System.out.println(a1[i]); //String[]
            }
            
            System.out.println("\n");
            Scanner input = new Scanner(System.in);
            int answer =  input.nextInt();
            //SSystem.out.println(answer);
            //System.out.print("\n\n" + answer + "\n"); 

            switch(answer){
                case 1: 
                    if (answer == 1) {B();} break;
                case 2: 
                    if (answer == 2) {A();} break;
                default: 
                    System.out.println(""); 
                    break;
            }
        
    }
        public static void B(){
            //scrivi un altro metodo con un altro passaggio della storia
            t.creaTesto("entri nella locanda.txt");
             String[] a1 = {
                "[ 1 ] Gli rispondi sgarbatamente",
                "[ 2 ] Fai finta di niente e continui a sorseggiare il tuo drink" };
        
            System.out.println(t.creaTesto("entri nella locanda.txt"));
            System.out.println("\n");

            for (int i = 0; i < a1.length; i++){
                System.out.println(a1[i]);
            }
            
            System.out.println("\n");
            Scanner input = new Scanner(System.in);
            int answer =  input.nextInt();

            switch(answer){
                case 1: 
                    if (answer == 1) {B();} break;
                case 2: 
                    if (answer == 2) {A();} break;
                default: 
                    System.out.println(""); 
                    break;
            }
        }
}
