package exercise5;

import java.time.LocalDate;

public class person {
    public String firstname;
    public String lastname;
    public LocalDate birthdate;
public person (String setfirstname, String setlastname, LocalDate birthdate){
    this.firstname= setfirstname;
    this.lastname= setlastname;
    this.birthdate=birthdate;
}

    public String toString(){
    return firstname + " " + lastname;
    }
}
