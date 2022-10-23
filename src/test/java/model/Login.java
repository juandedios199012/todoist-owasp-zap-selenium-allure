package model;

import com.github.javafaker.Faker;
public class Login {

    private final String user;
    private final String pwd;

    public Login(){
        var faker=new Faker();
        user=faker.internet().emailAddress();
        pwd=faker.internet().password();
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }
}
