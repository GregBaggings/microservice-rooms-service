package featureTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class RoomsControllerTests {
    private final static String ENDPOINT = "http://localhost:2224/v1";

    @Test
    public void getAllRooms() {
        Response resp = RestAssured.get(ENDPOINT + "/hotels/hotel/rooms");
        Assert.assertTrue(resp.asString().contains("Single Bed Standard"));
        Assert.assertFalse(resp.asString().isEmpty());
    }


    @Test
    public void getRoomsByID() {
        Response resp = RestAssured.get(ENDPOINT + "/hotels/hotel/1/rooms");
        Assert.assertTrue(resp.asString().contains("Single Bed Standard"));
        Assert.assertFalse(resp.asString().isEmpty());
    }

}
