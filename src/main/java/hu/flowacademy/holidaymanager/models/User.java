package hu.flowacademy.holidaymanager.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String role;

    @ManyToOne
    @JoinColumn
    private User boss;

    @OneToOne(cascade = CascadeType.PERSIST)
    private AvailableHolidays availableHolidays;

}
