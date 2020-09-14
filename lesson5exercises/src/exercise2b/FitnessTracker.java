package exercise2b;

import java.time.LocalDateTime;

public class FitnessTracker {
    public FitnessTracker (){
        this.fitnessActivity = "running";
        this.minutesSpent = 0;
        LocalDateTime year = LocalDateTime.now();
        this.date = "January 1, " + year.getYear();
    }
    public FitnessTracker (String fitnessActivity, int minutesSpent, String date){
        this.fitnessActivity = fitnessActivity;
        this.minutesSpent = minutesSpent;
        this.date = date;
    }

    private String fitnessActivity;
    private int minutesSpent;
    private String date;


    public String getFitnessActivity(){return fitnessActivity;}
    public int getMinutesSpent () {return minutesSpent;}

    public String toString(){
        return "\tFitness Activity is " + fitnessActivity +"." +
                "\n\tSpent minute is " + minutesSpent + "." +
                "\n\tYear is " + date;
    }
}
