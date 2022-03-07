import java.io.*;
import java.util.*;

public class day17_Java_String_Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(s.equals(new StringBuilder(s).reverse().toString())?"Yes":"No");
    }
}



