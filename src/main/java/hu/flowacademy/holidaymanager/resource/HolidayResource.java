package hu.flowacademy.holidaymanager.resource;

import hu.flowacademy.holidaymanager.models.DTO.HolidayRequestDTO;
import hu.flowacademy.holidaymanager.models.DTO.HolidayResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolidayResource {

    @PostMapping("/holiday")
    public HolidayResponseDTO addHoliday(@RequestBody HolidayRequestDTO holidayRequestDTO) {
        return null;
    }
}
