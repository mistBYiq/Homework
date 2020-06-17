package domain;

public class Student extends Person implements Comparable<Student> {
    private Long idStudent;
    private Integer course;
    private Person student;

    public Student() {
    }

    public Student(Long idStudent, Integer course, Person student) {
        this.idStudent = idStudent;
        this.course = course;
        this.student = student;
    }


    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student1 = (Student) o;

        if (getIdStudent() != null ? !getIdStudent().equals(student1.getIdStudent()) : student1.getIdStudent() != null)
            return false;
        if (getCourse() != null ? !getCourse().equals(student1.getCourse()) : student1.getCourse() != null)
            return false;
        return getStudent() != null ? getStudent().equals(student1.getStudent()) : student1.getStudent() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getIdStudent() != null ? getIdStudent().hashCode() : 0);
        result = 31 * result + (getCourse() != null ? getCourse().hashCode() : 0);
        result = 31 * result + (getStudent() != null ? getStudent().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", course=" + course +
                ", student=" + student +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Student o) {
        if (this.getIdStudent() > o.getIdStudent()) {
            return 1;
        }
        if (this.getIdStudent() < o.getIdStudent()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}