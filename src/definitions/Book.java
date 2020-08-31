/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfBook;
    private String nameOfAuthorOfBook;
    private String isbnNumberOfBook;

    public String getNameOfBook(){
        return nameOfBook;
    }
    public String getNameOfAuthorOfBook(){
        return nameOfAuthorOfBook;
    }
    public String getIsbnNumberOfBook(){
        return isbnNumberOfBook;
    }

    public void setNameOfBook(String nameOfBook){
        this.nameOfBook=nameOfBook;
    }
    public void setNameOfAuthorOfBook(String nameOfAuthorOfBook){
        this.nameOfAuthorOfBook=nameOfAuthorOfBook;
    }
    public void setIsbnNumberOfBook(String isbnNumberOfBook){
        this.isbnNumberOfBook=isbnNumberOfBook;
    }

    public Book(String nameOfBook,String nameOfAuthorOfBook,String isbnNumberOfBook){
        this.nameOfBook=nameOfBook;
        this.nameOfAuthorOfBook=nameOfAuthorOfBook;
        this.isbnNumberOfBook=isbnNumberOfBook;
    }
    public String toString(){
        return nameOfBook+","+nameOfAuthorOfBook+","+isbnNumberOfBook;
    }
}
