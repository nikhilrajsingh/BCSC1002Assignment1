/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;
import definitions.*;
import java.util.Scanner;
public class FrontDesk {
    public static void main(String[] args) {
        String detailsOfStudent;
        int choice;
        Book[]bookNames=new Book[3];
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                "How may I help you today?\n" +
                "1. Issue a new book for me.\n" +
                "2. Return a previously issues book for me.\n" +
                "3. Show me all my issues books.\n" +
                "4. Exit.");
        Scanner scannerObject=new Scanner(System.in);
        choice=scannerObject.nextInt();
        Book bookObject=new Book("Modern Physics","HC Verma","5878Hd7d887H");
        Student studentObject=new Student("Nikhil Raj Singh",3,1924374839,bookNames);
        if (choice==1){
            System.out.println("New Book Issued.");
        }
        else if (choice==2){
            System.out.println("Book Returned.");
        }
        else if(choice==3){
            System.out.println(studentObject);
        }
        else {
            System.out.println("Exited.");
        }

    }
}
