package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import model.Employee;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException{
    private Employee employee;
    public EmployeeNotFoundException(Employee employee) {
        this.employee = employee;

    }

    public Employee getEmployee() {
        return employee;
    }
}
