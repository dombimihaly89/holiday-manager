package hu.flowacademy.holidaymanager.models.DTO;

import hu.flowacademy.holidaymanager.models.Holiday;

import java.time.LocalDate;

public class HolidayRequestDTO {

    private String user;

    private LocalDate startDate;

    private LocalDate endDate;

    private Holiday.HOLIDAYTYPE type;

}
