public class NineInts {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        System.out.println("First Integer to Last Integer");
        for(int firstNum = 0; firstNum<num.length; firstNum++ ){
            System.out.println(num[firstNum]);
        }
        System.out.println("Last Integer to First Integer");
        for (int lastNum = 8; lastNum>=0; lastNum--){
            System.out.println(num[lastNum]);
        }
    }

}
