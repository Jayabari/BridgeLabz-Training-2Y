import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    int transactionId;
    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }
    public String toString() {
        return "Invoice created for Transaction ID: " + transactionId;
    }
}
public class InvoiceCreation {
    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);
        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)  
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
