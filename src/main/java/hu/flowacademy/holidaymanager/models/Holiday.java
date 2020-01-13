package hu.flowacademy.holidaymanager.models;

import hu.flowacademy.holidaymanager.models.DTO.HolidayRequestDTO;
import hu.flowacademy.holidaymanager.models.DTO.HolidayResponseDTO;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column
    @Enumerated(EnumType.STRING)
    private HolidayType type;

    @Column
    @Enumerated(EnumType.STRING)
    private HolidayStatus status = HolidayStatus.PENDING;

    @ManyToOne
    private User boss;

    @ManyToOne
    private User user;

    public void holidayFromDTO(HolidayRequestDTO holidayRequestDTO) {
        if (holidayRequestDTO.getId() != null) {
            this.setId(holidayRequestDTO.getId());
        }
        this.startDate = holidayRequestDTO.getStartDate();
        this.endDate = holidayRequestDTO.getEndDate();
        this.type = holidayRequestDTO.getType();
    }

    public static enum HolidayType {
        PTO,
        VTO,
        SICK
    }

    public static enum HolidayStatus {
        APPROVED,
        DECLINED,
        PENDING
    }

}
