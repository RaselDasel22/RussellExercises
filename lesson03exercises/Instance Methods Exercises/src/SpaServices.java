public class SpaServices
{
    private String ServiceDescription;
    private double Price;

    public void setServiceDescription(String Service)
    {
        ServiceDescription = Service;
    }
    public void setPrice(double price) {
        Price = price;
    }

    public String getServiceDescription() {
        return ServiceDescription;
    }

    public double getPrice() {
        return Price;
    }
}
