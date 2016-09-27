
/**
 * Write a description of class YouPass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class YouPass
{ public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int grade;
        
        System.out.println("Please enter your grade number");
        
       grade = reader.nextInt();
        
       if (grade >= 90) { 
           System.out.println("You recieved a A");
     
    }
    else if (grade >=80) {
        System.out.println("You recieved a B");
    }
    else if (grade >=70){
        System.out.println("You recieved a C");
    }
    else if (grade >=65){
        System.out.println("You recieved a D");
    }
    else if (grade >=60) {
        System.out.println("You recieved a F");
    }
    else if (grade >=0){
        System.out.println("You recieved a F");
    
}
}
}

