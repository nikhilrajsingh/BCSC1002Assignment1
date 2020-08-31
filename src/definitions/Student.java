/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String nameOfStudent;
    private long universityRollNumber;
    private int numberOfBookIssued;
    private Book[] namesOfBookIssued= new Book[3];

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBookIssued() == student.getNumberOfBookIssued() &&
                getNameOfStudent().equals(student.getNameOfStudent()) &&
                Arrays.equals(getNamesOfBookIssued(), student.getNamesOfBookIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNameOfStudent(), getUniversityRollNumber(), getNumberOfBookIssued());
        result = 31 * result + Arrays.hashCode(getNamesOfBookIssued());
        return result;
    }
}
