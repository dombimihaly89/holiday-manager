package hu.flowacademy.holidaymanager.utils;

import hu.flowacademy.holidaymanager.models.AvailableHolidays;
import hu.flowacademy.holidaymanager.models.User;
import hu.flowacademy.holidaymanager.repository.AvailableHolidaysRepository;
import hu.flowacademy.holidaymanager.repository.HolidayRepository;
import hu.flowacademy.holidaymanager.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
@Slf4j
@Transactional
@AllArgsConstructor
public class InitDataLoader {

    @Autowired
    private AvailableHolidaysRepository availableHolidaysRepository;

    @Autowired
    private HolidayRepository holidayRepository;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    private void loadUsersAndAvailableHolidays() {
        // Create fake objects
        User user = new User();
        user.setUserName("Misi");
        user.setRole("Employee");
        user.setBoss(null);

        AvailableHolidays availableHolidays = new AvailableHolidays();
        //rootHolidays.setCount(Integer.MAX_VALUE);

        // Bind user and holidays together
        availableHolidays.setUser(user);
        user.setAvailableHolidays(availableHolidays);

        userRepository.save(user);
    }
}
