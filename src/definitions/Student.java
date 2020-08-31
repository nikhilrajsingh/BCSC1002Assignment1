/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String nameOfStudent;
    private long universityRollNumber;
    private int numberOfBookIssued;
    private Book[] namesOfBookIssued;

    public Book[] getNamesOfBookIssued() {
        return namesOfBookIssued;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }


    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public void setNamesOfBookIssued(Book[] namesOfBookIssued) {
        this.namesOfBookIssued = namesOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public Student(String nameOfStudent,int numberOfBookIssued,long universityRollNumber,Book[] namesOfBookIssued){
        this.nameOfStudent=nameOfStudent;
        this.namesOfBookIssued=namesOfBookIssued;
        this.numberOfBookIssued=numberOfBookIssued;
        this.universityRollNumber=universityRollNumber;
    }
    public String toString(){
       return nameOfStudent+","+namesOfBookIssued+","+numberOfBookIssued+","+universityRollNumber;
    }


}
