package exercise5;

public class CarInsurancePolicies {
    private int policyNumber;
    private int numPayments;
    private String residentCity;

     public CarInsurancePolicies(int num,int payments, String city){
         policyNumber = num;
         numPayments = payments;
         residentCity = city;
     }

    public CarInsurancePolicies(int num,int payments){
        policyNumber = num;
        numPayments = payments;
        residentCity = "Floridablanca";
    }

    public CarInsurancePolicies(int num){
        policyNumber = num;
        numPayments = 2;
        residentCity = "Floridablanca";
    }

    public void display(){
         System.out.println("Policy #"+policyNumber+". "+numPayments+
                 " payments annually. Driver resides in " + residentCity + ".");
    }
}
