import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {
    public List<Customer> customers = new ArrayList<>();

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void alphabetSorting(){
        boolean isSorted = false;
        String temp;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < customers.size()-1; i++){
                if (customers.get(i).getCustomerSurname().compareTo(customers.get(i+1).getCustomerSurname()) > 0){
                    isSorted = false;
                    Collections.swap(customers, i , i+1);
                }
            }
        }
        printCustomers();
    }

    public void printCustomers(){
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void sortByRangeNumberCards(int start, int end){
        boolean notInDatabase = true;
        if (start < 0 || end > 9999999){
            System.out.println("Incorrect numbers of range: ");
            return;
        }

        for (Customer customer : customers) {
            if (customer.getCustomerNumberCard() > start &&
                    customer.getCustomerNumberCard() < end) {
                notInDatabase = false;
                System.out.println(customer.toString());
            }
        }

        if(notInDatabase)
            System.out.println("In this range not exist credit cards!!! ");
    }
}
