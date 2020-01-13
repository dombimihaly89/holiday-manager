package hu.flowacademy.holidaymanager.repository;

import hu.flowacademy.holidaymanager.models.AvailableHolidays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableHolidaysRepository extends JpaRepository<AvailableHolidays, Long> {

}
