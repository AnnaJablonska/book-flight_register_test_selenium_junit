package utils;

import com.github.javafaker.Faker;
import utils.Generate;

public class User {

    private Faker faker;
    private String firstName;
    private String lastname;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String username;
    private String password;
    private Generate generate;


    public User(){
        faker = new Faker();
        generate = new Generate();
        email = generate.email();
        firstName = faker.name().firstName();
        lastname = faker.name().lastName();
        phoneNumber = faker.phoneNumber().phoneNumber();
        address = faker.address().streetAddress();
        city = faker.address().city();
        state = "dolnoslaskie";
        postalCode = "12-345";
        username = faker.name().username();
        password = faker.internet().password();
        printData();
    }

    public String printData() {
        return "utils.User{" +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", generate=" + generate +
                '}';
    }

    public Faker getFaker() {
        return faker;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Generate getGenerate() {
        return generate;
    }
}
