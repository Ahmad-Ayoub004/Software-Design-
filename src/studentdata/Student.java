package studentdata;

/**
 *This class +++ insert class description here +++
 *
 * @author Ahmad Ayoub
 */
public class Student {

    private String studentName;
    private String progName;

    public Student(){}

    public Student(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
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
}

