package hu.flowacademy.holidaymanager.resource;

import hu.flowacademy.holidaymanager.models.DTO.HolidayRequestDTO;
import hu.flowacademy.holidaymanager.models.DTO.HolidayResponseDTO;
import hu.flowacademy.holidaymanager.models.Holiday;
import hu.flowacademy.holidaymanager.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HolidayResource {

    @Autowired
    HolidayService holidayService;

    @PostMapping("/holiday")
    public ResponseEntity<HolidayResponseDTO> addHoliday(@RequestBody HolidayRequestDTO holidayRequestDTO) {
        Holiday holiday = holidayService.addHoliday(holidayRequestDTO);
        return ResponseEntity.ok(new HolidayResponseDTO(holiday));
    }

    @PutMapping("/holiday")
    public ResponseEntity<HolidayResponseDTO> updateHoliday(@RequestBody HolidayRequestDTO holidayRequestDTO) {
        Holiday holiday = holidayService.addHoliday(holidayRequestDTO);
        return ResponseEntity.ok(new HolidayResponseDTO(holiday));
    }

    @PutMapping("/holiday/approve")
    public ResponseEntity<HolidayResponseDTO> approveHoliday(@RequestParam Long id, @RequestParam Holiday.HolidayStatus status) {
        Holiday holiday = holidayService.approveHoliday(id, status);
        return ResponseEntity.ok(new HolidayResponseDTO(holiday));

    }
}
