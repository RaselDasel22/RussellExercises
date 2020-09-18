package exercise5;

import java.time.LocalDateTime;

public class person {
    public String firstname;
    public String lastname;
    public LocalDateTime birthdate;
public person (String setfirstname, String setlastname){
    firstname= setfirstname;
    lastname= setlastname;
}

public String getFirstname(){
    return this.firstname;
}

public String getLastname(){
    return this.lastname;
}

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public String toString(){
    return firstname + " " + lastname;
    }
}
