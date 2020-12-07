public class CountsByTen {
    public static void main(String[] args) {
        int countByTen = 10;
        int newLine = 50;

        while (countByTen <= 500) {
            while (countByTen <= newLine) {
                if (countByTen < newLine) {
                    System.out.print(countByTen + ", ");
                }
                else System.out.print(countByTen);
                countByTen += 10;
            }
            System.out.println();
            newLine += 50;
        }


    }
}
