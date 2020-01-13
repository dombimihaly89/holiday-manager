package hu.flowacademy.holidaymanager.models.DTO;

import hu.flowacademy.holidaymanager.models.Holiday;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HolidayResponseDTO {

    private LocalDate startDate;

    private LocalDate endDate;

    private Holiday.HolidayType type;

    private Holiday.HolidayStatus status;

    private String userName;

    public HolidayResponseDTO(Holiday h) {
        this.startDate = h.getStartDate();
        this.endDate = h.getEndDate();
        this.type = h.getType();
        this.status = h.getStatus();
        this.userName = h.getUser().getUserName();
    }

}
