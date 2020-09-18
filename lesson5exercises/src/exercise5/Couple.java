package exercise5;

public class Couple {
    private person groom;
    private person bride;
public Couple(person groom, person bride){
    this.groom = groom;
    this.bride = bride;
}

    public person getGroom() {

        return groom;
    }

    public person getBride() {
        return bride;
    }

    public String toString(){
        return groom + " and " + bride;
    }
}
