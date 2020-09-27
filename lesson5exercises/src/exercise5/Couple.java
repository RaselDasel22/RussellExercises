package exercise5;

public class Couple {
    private person groom;
    private person bride;
public Couple(person groom, person bride){
    this.groom = groom;
    this.bride = bride;
}

    public String toString(){
        return groom + " and " + bride;
    }
}
