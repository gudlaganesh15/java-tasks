abstract class PaymentService {

    abstract void pay(double amount);

    void showMessage() {
        System.out.println("Payment Processing");
    }

    void paymentDetails(String name) {
        System.out.println("Payment Method: " + name);
    }

    void paymentDetails(String name, double amount) {
        System.out.println(name + " Payment: " + amount);
    }
}

interface Receipt {
    void generateReceipt();

    default void showReceipt() {
        System.out.println("Receipt Generated");
    }

    static void company() {
        System.out.println("ABC Payment Company");
    }
}

interface Notification {
    void sendNotification();
}

class CreditCardPayment extends PaymentService implements Receipt, Notification {

    @Override
    void pay(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Receipt");
    }

    @Override
    public void sendNotification() {
        System.out.println("Credit Card Notification Sent");
    }
}

class UPIPayment extends PaymentService implements Receipt {

    @Override
    void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI Receipt");
    }
}

class BankPayment extends PaymentService implements Notification {

    @Override
    void pay(double amount) {
        System.out.println("Bank Payment: " + amount);
    }

    @Override
    public void sendNotification() {
        System.out.println("Bank Notification Sent");
    }
}

public class Task9 {

    public static void main(String[] args) {

        System.out.println("1. Polymorphism");

        CreditCardPayment c = new CreditCardPayment();
        c.pay(5000);

        System.out.println("2. Compile Time Polymorphism");

        c.paymentDetails("Credit Card");
        c.paymentDetails("Credit Card", 5000);

        System.out.println("3. Runtime Polymorphism");

        PaymentService p;

        p = new CreditCardPayment();
        p.pay(1000);

        p = new UPIPayment();
        p.pay(2000);

        p = new BankPayment();
        p.pay(3000);

        System.out.println("4. Parent Reference + Child Object");

        PaymentService obj = new CreditCardPayment();
        obj.pay(4000);

        System.out.println("5. Upcasting");

        PaymentService up = new UPIPayment();
        up.pay(1500);

        System.out.println("6. Downcasting");

        if (up instanceof UPIPayment) {
            UPIPayment down = (UPIPayment) up;
            down.pay(2500);
        }

        System.out.println("7. instanceof");

        System.out.println(obj instanceof CreditCardPayment);

        System.out.println("8. Dynamic Method Dispatch");

        PaymentService d = new BankPayment();
        d.pay(6000);

        System.out.println("9. Abstraction");

        PaymentService service = new CreditCardPayment();
        service.showMessage();

        System.out.println("10. Abstract Method");

        service.pay(7000);

        System.out.println("11. Concrete Method");

        service.showMessage();

        System.out.println("12. Interface");

        CreditCardPayment card = new CreditCardPayment();
        card.generateReceipt();

        System.out.println("13. implements");

        card.sendNotification();

        System.out.println("14. Multiple Interfaces");

        System.out.println("CreditCardPayment implements Receipt and Notification");

        System.out.println("15. Interface Reference");

        Receipt r = new UPIPayment();
        r.generateReceipt();

        System.out.println("16. Default Method");

        r.showReceipt();

        System.out.println("17. Static Interface Method");

        Receipt.company();

        System.out.println("18. Payment Service Practice");

        PaymentService payment;

        payment = new CreditCardPayment();
        payment.pay(10000);

        payment = new UPIPayment();
        payment.pay(5000);

        payment = new BankPayment();
        payment.pay(8000);
    }
}