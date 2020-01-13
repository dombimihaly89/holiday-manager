package hu.flowacademy.holidaymanager.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column
    private HOLIDAYTYPE type;

    @Column
    private HOLIDAYSTATUS status;

    @Column
    @ManyToOne
    private User boss;

    @Column
    @ManyToOne
    private User user;

    public static enum HOLIDAYTYPE {
        PTO,
        VTO,
        SICK
    }

    public static enum HOLIDAYSTATUS {
        APPROVED,
        DECLINED,
        PENDING
    }

}
