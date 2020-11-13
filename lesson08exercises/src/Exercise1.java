public class Exercise1 {
    public static void main(String[] args) {
        String[] MONTH = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int monthOfYear = 0;

        while (monthOfYear < MONTH.length){
            System.out.println(MONTH[monthOfYear]);
            monthOfYear++;
        }

    }
}
