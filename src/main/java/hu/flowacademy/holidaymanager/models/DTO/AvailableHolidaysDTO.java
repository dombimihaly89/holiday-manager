package hu.flowacademy.holidaymanager.models.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AvailableHolidaysDTO {

    private String userName;

    private int count;

    private int extra;
}
