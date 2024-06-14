package dto;

public class MemberDto {

    private Integer id;
    private String firstName;
    private String lastName;

    private String birthDay;

    public MemberDto(Integer id, String firstName, String lastName, String birthDay) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public MemberDto() {
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
