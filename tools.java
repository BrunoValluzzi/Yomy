
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
                /* String f = new String(s, "UTF-8");
                System.out.println(f); */
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
}