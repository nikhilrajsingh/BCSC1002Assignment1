/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

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
    @Override
    public String toString(){
        return nameOfBook+","+nameOfAuthorOfBook+","+isbnNumberOfBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfBook(), book.getNameOfBook()) &&
                Objects.equals(getNameOfAuthorOfBook(), book.getNameOfAuthorOfBook()) &&
                Objects.equals(getIsbnNumberOfBook(), book.getIsbnNumberOfBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getNameOfAuthorOfBook(), getIsbnNumberOfBook());
    }
}
