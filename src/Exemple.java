/**
 * Created by leleluattila on 12/12/15.
 */
import java.util.Scanner;

public class Exemple {
    public static void main(String[] args){
        boolean x = true;
        boolean y = false;
        if (x == true)
            System.out.println("Hello");
        else
            System.out.println("Bye");

        int i =7;
        if (i<=10){
            System.out.println("Hello 2");
        }else{
            System.out.println("Bye 2");
        }

        int w =8;

        int a = i +w;

        char f = 'a';
        char g = 'b';

        System.out.println("variabile: " +f+ " "+g+" "+ a+" "+x+" "+y);

    }
}
