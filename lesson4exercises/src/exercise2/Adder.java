package exercise2;

public class Adder
{
    public void main(String[] args) {
        sum(5,5);
        sum(5,5,5);
        sum(5,5,5,5);
        sum(5,5,5,5,5);
    }

    public void sum(int num1, int num2)
    {
        int sum = num1 + num2;
        System.out.println("sum>> "  + sum);
    }

    public void sum(int num1, int num2, int num3)
    {
        int sum = num1 + num2 + num3;
        System.out.println("sum>> "  + sum);
    }

    public void sum(int num1, int num2, int num3, int num4)
    {
        int sum = num1 + num2 + num3 + num4;
        System.out.println("sum>> "  + sum);
    }

    public void sum(int num1, int num2, int num3, int num4, int num5)
    {
        int sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("sum>> "  + sum);
    }
}
