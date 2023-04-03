package kodlama.io.rentacar.business.dto.responses.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetMaintenanceResponse {
    private int id;
    private int carId;
    private Date dateIn;
    private Date dateOut;

    private double cost;

    private String description;
}
