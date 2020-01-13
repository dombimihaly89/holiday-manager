package hu.flowacademy.holidaymanager.models.DTO;

import hu.flowacademy.holidaymanager.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserLoginDTO {

    private String name;

    private String password;

    private String role;
}
