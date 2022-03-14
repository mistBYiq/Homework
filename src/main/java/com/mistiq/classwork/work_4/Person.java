package main.java.com.mistiq.classwork.work_4;

public class Person {

    private String gender;
    private String name;
    private String lastName;
    private String patronymic;
    private Integer dateBirth;

    {
        gender = "not select";
        name = "Boris";
        lastName = "Blade";
        patronymic = "Jonovich";
        dateBirth = 1965;
    }

    public Person() {
    }

    public Person(String gender, String name, String lastName, String patronymic, Integer dateBirth) {
        this.gender = gender;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Integer dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getGender() != null ? !getGender().equals(person.getGender()) : person.getGender() != null) return false;
        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getLastName() != null ? !getLastName().equals(person.getLastName()) : person.getLastName() != null)
            return false;
        if (getPatronymic() != null ? !getPatronymic().equals(person.getPatronymic()) : person.getPatronymic() != null)
            return false;
        return getDateBirth() != null ? getDateBirth().equals(person.getDateBirth()) : person.getDateBirth() == null;
    }

    @Override
    public int hashCode() {
        int result = getGender() != null ? getGender().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getPatronymic() != null ? getPatronymic().hashCode() : 0);
        result = 31 * result + (getDateBirth() != null ? getDateBirth().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}