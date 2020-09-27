package Exercise1;

public class Card {
    private char suit;
    private int rank;
public Card(char suit, int rank){
    this.suit = suit;
    this.rank = rank;
}

public String toString(){
    String suitCard;
    if (this.suit == 's'){ suitCard="spades";}
    else if (this.suit == 'h'){suitCard="hearts";}
    else if (this.suit == 'd'){suitCard="diamonds";}
    else {suitCard="clubs";}
    return rank +" of " + suitCard;
}
}
