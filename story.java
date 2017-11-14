
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
                System.out.println(a1[i]);
            }
            
                     
            switch(t.inputUtente()){
                case 1: 
                    B(); break;
                case 2: 
                    C(); break;
                default: 
                    System.out.println(""); 
                    break;
            }
        
    }
        public static void B(){
            //scrivi un altro metodo con un altro passaggio della storia
            t.creaTesto("entriNellaLocanda.txt");
             String[] a1 = {
                "[ 1 ] Gli rispondi sgarbatamente",
                "[ 2 ] Fai finta di niente e continui a sorseggiare il tuo drink" };
        
            System.out.println(t.creaTesto("entriNellaLocanda.txt"));
            System.out.println("\n");

            for (int i = 0; i < a1.length; i++){
                System.out.println(a1[i]);
            }
            
           switch(t.inputUtente()){
                case 1: 
                    B(); break;
                case 2: 
                    A(); break;
                default: 
                    System.out.println(""); 
                    break;
            }
        }
        public static void C(){
            
            t.creaTesto("cerchiUnAltropercorso.txt");
            
            String[] a1 = {
                "[ 1 ] Lasci li la ragazza e te ne vai",
                "[ 2 ] Soccorri la ragazza sconosciuta" };
        
            System.out.println(t.creaTesto("cerchiUnAltropercorso.txt"));
            System.out.println("\n");

            for (int i = 0; i < a1.length; i++){
                System.out.println(a1[i]);
            }
            
                     
            switch(t.inputUtente()){
                case 1: 
                    D(); break;
                case 2: 
                    E(); break;
                default: 
                    System.out.println(""); 
                    break;
            }
        }

        public static void D(){
            
            t.creaTesto("faiFintaDiNiente.txt");
            
            String[] a1 = {
                "[ 1 ] Torna al menù di inizio"}; //fare nell'interfaccia una schermata con scritto "inizia storia"
        
            System.out.println(t.creaTesto("faiFintaDiNiente.txt"));
            System.out.println("\n");

            for (int i = 0; i < a1.length; i++){
                System.out.println(a1[i]);
            }
            
                     
            switch(t.inputUtente()){
                case 1: 
                    System.out.println(" VAI AL MENU DI INIZIO "); break; //devo mettere il metodo per tornare al menù    
                default: 
                    System.out.println(""); 
                    break;
            } 
        }

         public static void E(){
            
            t.creaTesto("soccorriLaRagazza.txt");
            
            String[] a1 = {
                "[ 1 ] Proponi di darle una mano fino al raggiungimento del suo obiettivo",
                "[ 2 ] Non hai idea su quale sia il miglior comportamento da avere" };
        
            System.out.println(t.creaTesto("soccorriLaRagazza.txt"));
            System.out.println("\n");

            for (int i = 0; i < a1.length; i++){
                System.out.println(a1[i]);
            }
            
                     
            switch(t.inputUtente()){
                case 1: 
                    F(); break; 
                case 2: 
                    A(); break; //da mettere G
                default: 
                    System.out.println(""); 
                    break;
            }
        } 
        public static void F(){
            
            t.creaTesto("aiutiLaRagazza.txt");
            
            String[] a1 = {
                "[ 1 ] Raccontami dove diavolo sono finito",
                "[ 2 ] Spiegami il perchè di questa atmosfera" };
        
            System.out.println(t.creaTesto("aiutiLaRagazza.txt"));
            System.out.println("\n");

            for (int i = 0; i < a1.length; i++){
                System.out.println(a1[i]);
            }
            
                     
            switch(t.inputUtente()){
                case 1: 
                    H(); break; 
                case 2: 
                    H(); break; 
                default: 
                    System.out.println(""); 
                    break;
            }
        } 
        public static void H(){
            
            t.creaTesto("vaiDallaRaga.txt");
            
            String[] a1 = {
                "[ 1 ] Provi a parlare con la ragazza e sentire la sua opinione",
                "[ 2 ] Abbandoni la ragazza alla sua sorte" };
        
            System.out.println(t.creaTesto("vaiDallaRaga.txt"));
            System.out.println("\n");

            for (int i = 0; i < a1.length; i++){
                System.out.println(a1[i]);
            }
            
                     
            switch(t.inputUtente()){
                case 1: 
                    System.out.println("Fine primo capitolo! Stay tuned!");
                    break; 
                case 2: 
                    System.out.println("Fine primo capitolo! Stay tuned!");
                    break;
                default: 
                    System.out.println("Fine primo capitolo! Stay tuned!"); 
                    break;
            }
        }















}
