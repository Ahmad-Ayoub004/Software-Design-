package studentdata;

/**
 *This class +++ insert class description here +++
 *
 * @author Ahmad Ayoub
 */
public class Student{

    private String studentName;
    private String progName;

    public Student(){}

    public Student(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName, String progName){
        this.studentName = studentName;
        this.progName = progName;
    }

    /**
     * @return the progName
     */
    public String getProgName() {
        return progName;
    }

    /**
     * @param progName the progName to set
     */
    public void setProgName(String progName) {
        this.progName = progName;
    }

    void setStudentName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

