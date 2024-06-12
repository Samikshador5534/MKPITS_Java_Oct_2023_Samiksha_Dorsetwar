package com.example.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequestSql {

    private Integer id;

    @NotNull(message = "'username' cannot be null")
    @Size(min = 3, max = 45, message = "'username' must be between 3 and 45 characters")
    private String username;

    @NotNull(message = "'password' cannot be null")
    @Size(min = 4, message = "Password must be at least 4 characters long")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character"
    )
    private String password;

    @NotNull(message = "'firstName' cannot be null")
    @Size( max = 45, message = "'firstName' must be between  45 characters")
    @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
    private String firstName;

    @NotNull(message = "'lastName' cannot be null")
    @Size( max = 45, message = "'lastName' must be between 45 characters")
    @Pattern(regexp = "[a-zA-Z]+", message = "'lastName' can only contain alphabets")
    private String lastName;

    @NotNull(message = "'mobileNo' cannot be null")
    @Size(min = 10, max = 10, message = "'mobile' must be exactly 10 digits")
    @Pattern(regexp = "\\d{10}", message = "'mobile' must be a 10-digit number")
    private String mobile;

    @NotNull(message = "'email' cannot be null and must follow the format 'xyz3@gmail.com'")
    @Pattern(
            regexp = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,3}",
            message = "'email' must be in the format 'xyz3@gmail.com'"
    )
    private String email;

    private LocalDate dateOfBirth;
}
