package hu.flowacademy.holidaymanager.models.DTO;

import hu.flowacademy.holidaymanager.models.Holiday;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HolidayRequestDTO {

    private Long Id;

    private Long userId;

    private LocalDate startDate;

    private LocalDate endDate;

    private Holiday.HolidayType type;

}
