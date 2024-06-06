package ca.bcit.comp2501.justinandkaren;

// Import statements

/**
 * Represents a Student's'first name, last name, ID number, birth year, percentage grade, and pass status.
 * @author Karen Lim
 * @author Justin Cardas
 * Version 1.0
 */
public class Student
{
    private static final int PASSING_GRADE = 60;
    private static final int MIN_BIRTH_YEAR = 1900;
    private static final int MAX_BIRTH_YEAR = 2100;

    private final String firstName;
    private final String lastName;
    private final String idNumber;
    private final int birthYear;
    private double grade;
    private boolean pass;

    /**
     * No-arg constructor.
     */
    public Student()
    {
        //
    }

    /**
     * Overloaded constructor.
     * @param firstName the first name of the student
     * @param lastName the last name of the student
     * @param idNumber the ID number of the student
     * @param birthYear the birth year of the student
     * @param grade the percentage grade of the student
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Student(final String firstName,
                   final String lastName,
                   final String idNumber,
                   final int birthYear,
                   final double grade)
    {
        //
    }

    // Getters and setters
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getIdNumber()
    {
        return idNumber;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public double getGrade()
    {
        return grade;
    }

    public void setGrade(double grade)
    {
        // Implement setter with validation
    }

    public boolean isPass()
    {
        return pass;
    }

    /**
     * Overrides toString() to provide a string representation of the student.
     * @return a string representation of the student
     */
    @Override
    public String toString()
    {
        // Implement toString method
        return "";
    }
}
