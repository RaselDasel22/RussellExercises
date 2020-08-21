package Exercise11;

import Exercise11.MyTime;

import java.util.Scanner;


public class TestMyTime
{
    public static void main(String[] args)
    {
     Scanner user = new Scanner(System.in);
     MyTime time = new MyTime();
     System.out.print("Please enter hour: ");
     int hour = user.nextInt();
     System.out.print("Please enter minute: ");
     int minute = user.nextInt();
     System.out.print("Please enter second: ");
     int second = user.nextInt();


     time.setHour(hour);
     time.setMinute(minute);
     time.setSecond(second);

     System.out.println(time);
    }

}
