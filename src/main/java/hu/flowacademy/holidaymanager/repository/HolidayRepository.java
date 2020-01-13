package hu.flowacademy.holidaymanager.repository;

import hu.flowacademy.holidaymanager.models.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidayRepository extends JpaRepository<Holiday, Long> {

}
