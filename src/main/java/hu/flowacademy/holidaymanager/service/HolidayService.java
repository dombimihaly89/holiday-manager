package hu.flowacademy.holidaymanager.service;

import hu.flowacademy.holidaymanager.models.DTO.HolidayRequestDTO;
import hu.flowacademy.holidaymanager.models.DTO.HolidayResponseDTO;
import hu.flowacademy.holidaymanager.models.Holiday;
import hu.flowacademy.holidaymanager.models.User;
import hu.flowacademy.holidaymanager.repository.HolidayRepository;
import hu.flowacademy.holidaymanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HolidayService {

    @Autowired
    private HolidayRepository holidayRepository;

    @Autowired
    private UserRepository userRepository;

    public Holiday addHoliday(HolidayRequestDTO holidayRequestDTO) {
        Holiday holiday = new Holiday();
        holiday.holidayFromDTO(holidayRequestDTO);
        if (holidayRequestDTO.getId() != null) {
            holiday.setStatus(holidayRepository.findById(holidayRequestDTO.getId()).orElse(null).getStatus());
        }
        if (holidayRequestDTO.getId() == null) {
            holiday.setStatus(Holiday.HolidayStatus.PENDING);
        }
        if (holiday.getStatus() != Holiday.HolidayStatus.PENDING) {
            throw new RuntimeException("Holiday cannot change, because it's status is " + holiday.getStatus());
        }
        Optional<User> user = userRepository.findById(holidayRequestDTO.getUserId());

        if (user.isPresent()) {
            holiday.setUser(user.get());
            holidayRepository.save(holiday);
            return holiday;
        } else {
            throw new RuntimeException("User cannot be found.");
        }
    }

    public Holiday approveHoliday(Long id, Holiday.HolidayStatus status) {
        Optional<Holiday> optionalHoliday = holidayRepository.findById(id);
        if (optionalHoliday.isPresent()) {
            Holiday holiday = optionalHoliday.get();
            holiday.setStatus(status);
            holidayRepository.save(holiday);
            return holiday;
        } else {
            throw new RuntimeException("User cannot be found.");
        }

    }

}
