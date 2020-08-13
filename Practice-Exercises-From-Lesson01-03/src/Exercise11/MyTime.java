package Exercise11;


public class MyTime
{
     private int hour;
     private int minute;
     private int second;

     public void setHour(int Hour) { this.hour = Hour; }
     public int getHour() { return hour; }

     public void setMinute(int Minute)
    {
        this.minute = Minute;
    }
     public int getMinute()
    {
        return minute;
    }

     public void setSecond(int Second)
    {
        this.second = Second;
    }
     public int getSecond()
    {
        return second;
    }

     public String toString()
    {

        String HH = hour < 10 ? ("0" + hour): String.valueOf(hour);
        String MM = minute < 10 ? ("0" + minute): String.valueOf(minute);
        String SS = second < 10 ? ("0" + second): String.valueOf(second);

        return "The time is "+"'"+HH+":"+MM+":"+SS+"'";

    }


}

