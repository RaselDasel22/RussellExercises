public class CountsByTen {
    public static void main(String[] args) {
    for (int number = 10; number<=500; number=number+10){
        if (number%50 == 0)
        System.out.println(number);
        else System.out.print(number+", ");

        }
    }
}
