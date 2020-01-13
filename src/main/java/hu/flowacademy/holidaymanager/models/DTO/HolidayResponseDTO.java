package hu.flowacademy.holidaymanager.models.DTO;

import hu.flowacademy.holidaymanager.models.Holiday;
import hu.flowacademy.holidaymanager.models.User;

import java.time.LocalDate;

public class HolidayResponseDTO {

    private LocalDate startDate;

    private LocalDate endDate;

    private Holiday.HOLIDAYTYPE type;

    private Holiday.HOLIDAYSTATUS status;
}
