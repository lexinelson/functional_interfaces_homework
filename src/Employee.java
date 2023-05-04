import java.math.BigDecimal;
import java.util.Objects;

public class Employee {

    private String name;
    private String role;
    private Integer age;
    private BigDecimal salary;

    public Employee(String name, String role, Integer age, BigDecimal salary) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String role() {
        return this.role;
    }

    public void role(String role) {
        this.role = role;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name)
                && Objects.equals(role, employee.role)
                && Objects.equals(age, employee.age)
                && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role, age, salary);
    }
}
