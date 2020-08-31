/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.lang.reflect.Constructor;

public class Library {
    private Book[] booksCurrentlyAvailable;

    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable;
    }

    public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    public Library(Book[] booksCurrentlyAvailable){
        this.booksCurrentlyAvailable=booksCurrentlyAvailable;
    }


}
