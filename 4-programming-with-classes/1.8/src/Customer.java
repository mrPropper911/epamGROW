import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    private int idCustomer;
    private String customerSurname;
    private String customerName;
    private String customerPatronymic;
    private String customerAddress;
    private int customerNumberCard;
    private int customerBankAccountNumber;

    public Customer(int idCustomer, String customerSurname, String customerName, String customerPatronymic,
                    String customerAddress, int customerNumberCard, int customerBankAccountNumber) {
        this.idCustomer = idCustomer;
        this.customerSurname = customerSurname;
        this.customerName = customerName;
        this.customerPatronymic = customerPatronymic;
        this.customerAddress = customerAddress;
        this.customerNumberCard = customerNumberCard;
        this.customerBankAccountNumber = customerBankAccountNumber;
    }

    public Customer() {
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPatronymic(String customerPatronymic) {
        this.customerPatronymic = customerPatronymic;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerNumberCard(int customerNumberCard) {
        this.customerNumberCard = customerNumberCard;
    }

    public void setCustomerBankAccountNumber(int customerBankAccountNumber) {
        this.customerBankAccountNumber = customerBankAccountNumber;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPatronymic() {
        return customerPatronymic;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public int getCustomerNumberCard() {
        return customerNumberCard;
    }

    public int getCustomerBankAccountNumber() {
        return customerBankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer" +
                "idCustomer=" + idCustomer +
                ", Surname='" + customerSurname + '\'' +
                ", Name='" + customerName + '\'' +
                ", Patronymic='" + customerPatronymic + '\'' +
                ", Address='" + customerAddress + '\'' +
                ", NumberCard=" + customerNumberCard +
                ", BankAccountNumber=" + customerBankAccountNumber;
    }

    public static void main(String[] args) throws IOException {
        /*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер `банковского счета.
    Найти и вывести:
        a) список покупателей в алфавитном порядке;
        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int choise = 3;

        Bank myBank = new Bank();
          Customer customer1 = new Customer(1, "Loki" , "Lo", "Loinovich", "st.50year,h2", 2113211, 311);
          Customer customer2 = new Customer(2, "Kioki" , "Adrio", "Penovich", "st.Lenina", 5217221, 411);
          Customer customer3 = new Customer(3, "Xople" , "Mino", "Minnovich", "st.Lopa,h1", 1213229, 123);

       myBank.customers.add(customer1);
       myBank.customers.add(customer2);
       myBank.customers.add(customer3);
       
       while (true) {
           System.out.println("\nChoose operation: \n" +
                   "1 - Sort surnames by alphabet: \n" +
                   "2 - Sort number cards by range: \n" +
                   "3 - Exit");
           choise = Integer.parseInt(bufferedReader.readLine());
           switch (choise) {
               case (1):
                   myBank.alphabetSorting();
                   break;
               case (2):
                   System.out.println("Enter range of number cards [1-9999999]");
                   myBank.sortByRangeNumberCards(Integer.parseInt(bufferedReader.readLine()),
                           Integer.parseInt(bufferedReader.readLine()));
                   break;
               case (3):
                   return;
               default:
                   System.out.println("Incorrect number, please enter number (1-3)");
                   break;
           }
       }
    }
}


















