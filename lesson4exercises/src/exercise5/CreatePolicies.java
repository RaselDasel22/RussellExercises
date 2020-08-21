package exercise5;

public class CreatePolicies {
    public static void main(String[] args) {
        CarInsurancePolicies first = new CarInsurancePolicies(123);
        CarInsurancePolicies second = new CarInsurancePolicies(456, 4);
        CarInsurancePolicies third = new CarInsurancePolicies(789,12,"Guagua");
        //CarInsurancePolicies fourth = new CarInsurancePolicies();

        first.display();
        second.display();
        third.display();
        //fourth.display();
    }

}
