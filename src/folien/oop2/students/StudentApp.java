package folien.oop2.students;

public class StudentApp
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Anna", 1001);
        Student s2 = new Student("Ben", 1002);
        Student s3 = new Student("Clara", 1003);

        s1.setGrades(new double[]{1.0, 2.0, 1.5});
        s2.setGrades(new double[]{2.5, 3.0});
        s3.setGrades(new double[]{1.0, 1.0, 1.0, 2.0});

        System.out.println(s1.getName() + "'s average: " + s1.calculateAverage());
        System.out.println(s2.getName() + "'s average: " + s2.calculateAverage());
        System.out.println(s3.getName() + "'s average: " + s3.calculateAverage());
        System.out.println("-------------------------");

        //comparing s1 to s2
        int result1 = s1.compareStudentGrades(s2);
        if (result1 == 1)
        {
            System.out.println(s1.getName() + " has a higher average than " + s2.getName());
        }
        else if (result1 == -1)
        {
            System.out.println(s1.getName() + " has a lower average than " + s2.getName());
        }
        else
        {
            System.out.println(s1.getName() + " and " + s2.getName() + " have the same average.");
        }

        //comparing s2 to s3
        int result2 = s2.compareStudentGrades(s3);
        if (result2 == 1)
        {
            System.out.println(s2.getName() + " has a higher average than " + s3.getName());
        }
        else if (result2 == -1)
        {
            System.out.println(s2.getName() + " has a lower average than " + s3.getName());
        }
        else
        {
            System.out.println(s2.getName() + " and " + s3.getName() + " have the same average.");
        }

        Student.printStudentCount(); //the class, not caling undividual students like s1 or s2
    }
}
