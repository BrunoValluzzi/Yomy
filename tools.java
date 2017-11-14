
package yomy;


import java.util.*;
import java.lang.*;
import java.io.*;

class Tools {
 public static String creaTesto(String q){
        try {
            FileReader  x = new FileReader(q);
            BufferedReader in  = new BufferedReader(x);
            List<String> a = new ArrayList<String>(); 
            String s;
            while ((s = in.readLine()) != null){
                a.add(s);
            }
            String r = String.join("\n", a);
            return r;
        } catch (FileNotFoundException ex1) {
            System.out.println("none");
        } catch (IOException ex2) {
            System.out.println("none");
        }
        return "";
 }
 public static int inputUtente(){

     System.out.println("\n");
            Scanner input = new Scanner(System.in);
            int answer =  input.nextInt();
            return answer;

 }
}