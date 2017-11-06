


import java.util.*;
import java.lang.*;
import java.io.*;



class Test {
    public static String xyz(String q){
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
    public static void main(String[] args){

        System.out.println(xyz("./file.bruno"));

        String[] a1 = {
            "[ 1 ] vai a sinistra",
            "[ 2 ] vai a destra", 
            "[ 3 ] fai una giravolta", 
            "[ 4 ] ti metti a piangere ", 
            "[ 5 ] abbandoni l'informatica perchè capisci che non è una strada percorribile per il solo piacere"};
        String[] a2 = {"meth_1()", "pox_2", "pox_3", "pox_4", "pox_5"};

       

        for (int i = 0; i < a1.length; i++){
            
            //System.out.println(a1[i]); //String[]
        
    

        }
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        
        int answer =  input.nextInt();
        System.out.println(answer);

        System.out.print("\n\n" + answer + "\n");
    }


}