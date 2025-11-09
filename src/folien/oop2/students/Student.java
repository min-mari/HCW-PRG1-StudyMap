package folien.oop2.students;
/*Exercise
Create a class Student. A student has a name, a student number (Matrikelnummer), and an array of grades (double).
Additionally, keep track of how many student objects have been created using a class variable.
Implement a constructor that accepts name and student number and sets grades to an empty array.
Implement getters and setters for each field.
Write a method calculateAverage that returns the average of grades.
Write a method printStudentCount that prints how many students where created. •
Write a method compareStudentGrades that compares the average grade score of this object with another student’s grades.
Pass a Student object to the method and compare it with this object.
The method returns 1 if this student has a higher average, 0 if they are the same and -1 if this student has a lower average than the provided object.
In your Main class:
Create multiple student objects
Set their grades
Call functions from your Student class*/

public class Student
{
    private String name;
    private int studentNumber;
    private double[] grades;
    private static int studentCount = 0; //static means "belongs to the class, not to an individual object", if not static, each object has their own copy

    public Student(String name, int studentNumber)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.grades = new double[0];
        studentCount++;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public double[] getGrades()
    {
        return grades;
    }

    public void setGrades(double[] grades)
    {
        this.grades = grades;
    }

    public double calculateAverage()
    {
        if (grades.length == 0)
        {
            return 0.0;
        }

        double sum = 0;
        for (double grade : grades)
        {
            sum += grade;
        }

        return sum / grades.length;
    }

    public static void printStudentCount()
    {
        System.out.println("Number of students created: " + studentCount);
    }

    public int compareStudentGrades(Student other)
    {
        double thisAvg = this.calculateAverage();
        double otherAvg = other.calculateAverage();

        if (thisAvg > otherAvg)
        {
            return 1;
        }
        else if (thisAvg < otherAvg)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

}
