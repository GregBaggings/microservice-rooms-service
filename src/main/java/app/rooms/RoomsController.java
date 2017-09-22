package app.rooms;

import app.models.Rooms;
import app.models.RoomsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by Gergely_Agnecz on 8/1/2017.
 */
@RestController
public class RoomsController {

    @Autowired
    RoomsDAO roomsDAO;

    @RequestMapping("/v1/hotels/hotel/rooms")
    public ResponseEntity<?> roomPrices() {
        List<Rooms> rooms = roomsDAO.findAll();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @RequestMapping("/v1/hotels/hotel/{hotelId}/rooms")
    public ResponseEntity<?> roomPricesForAHotel(@PathVariable("hotelId") int hotelId) {
        List<Rooms> rooms = roomsDAO.findByhotelid(hotelId);
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }
}
