import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String... args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Bob Rooter", "Network Engineer", 55, new BigDecimal(200000)),
                new Employee("Alice Foreman", "System Administrator", 40, new BigDecimal(250000)),
                new Employee("Eve Smith", "Junior Software Developer", 22, new BigDecimal(100000)),
                new Employee("Chad Courier", "Office Secretary", 32, new BigDecimal(65000)),
                new Employee("Ada Lovelace", "CEO", 36, new BigDecimal(2000000)),
                new Employee("Grace Hopper", "Lead Network Architect", 43, new BigDecimal(1500000)),
                new Employee("Alan Turing", "Lead Security Engineer", 27, new BigDecimal(1000000))
        );

        // Place your code for sorted lists here
    }
}
