public class exercise3DemoOverload {
    public static void main(String[] args) {
        int month = 8, day = 17, year = 2020;
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    }

    public static void displayDate(int mm){
        System.out.println("Event date"+mm+"/"+"1/2018");
    }

    public static void displayDate(int mm, int dd){
        System.out.println("Event date"+mm+"/"+dd+"/2018");
    }
    public static void displayDate(int mm, int dd, int yy){
        System.out.println("Event date"+mm+"/"+dd+"/"+yy);
    }
}
