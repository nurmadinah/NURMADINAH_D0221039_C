import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class day26_java_primality_test{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println(new BigInteger(bufferedReader.readLine()).isProbablePrime(1)?"prime":"not prime");
    }
}
