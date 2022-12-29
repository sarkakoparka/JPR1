import java.sql.SQLOutput;

public class TravelOffice {
    Customer[] customers = new Customer[2];
    int customerCount;

    public void addCustomer(Customer customer) {
        if (customers.length == customerCount) {
            Customer[] temporaryTab = new Customer[customers.length + 2];
            System.arraycopy(customers, 0, temporaryTab, 0, customerCount);
        }
        customers[customerCount++] = customer;
    }

    public int getCustomerCount() {
        return customerCount;
    }
@Override
    public String toString() {
        String report = "";
        for (int i = 0; i < customerCount; i++) {
            report += customers[i] + "\n";
            return report;
        }
        return report;
    }
}
