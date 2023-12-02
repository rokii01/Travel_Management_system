public class Person {
    private String name;
    private int SSN;
    private String gender;
    private int phone_number;
    private String nationality;

    public Person() {

    }
    public Person(String name,int SSN,String gender,int phone_number,String nationality)
    {
        this.name=name;
        this.SSN=SSN;
        this.gender=gender;
        this.phone_number=phone_number;
        this.nationality=nationality;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
