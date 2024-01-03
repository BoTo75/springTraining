package employees;

import lombok.Data;

import java.security.SecureRandom;

@Data
public class EmployeeDto {
    private long id;
    private String name;
}
