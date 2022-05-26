package studentdata;
import java.util.Scanner;

/* @author Ahmad Ayoub */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Ahmad");
        Student s2 = new Student();
        Student s3 = new Student();
        s2.setStudentName("Ayoub");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        s3.setStudentName(sc.nextLine());

        System.out.println("Student Name: ");
        System.out.println(
                s1.getStudentName()+ " " 
                + s2.getStudentName() + " " 
                + s3.getStudentName()
        );

        //Create array of student object and print it

        Student[] studList = new Student[5];
        for(int i=0;i<studList.length;i++){
            System.out.println("Enter student name: ");
            String name = sc.nextLine();

            Student s = new Student(name);
            studList[i] = s;
        }

        //print the list
        for(var s:studList){
            System.out.println(s.getStudentName() + "Student Name: " + "Program Name: " + s.getProgName());
        }
    }

}
//testing edit
