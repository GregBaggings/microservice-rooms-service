package unitTests;

import app.models.RoomsDAO;
import app.rooms.RoomsController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
public class RoomsControllerUnitTests {
    @InjectMocks
    private RoomsController roomsController;
    private MockMvc mvc;

    @Mock
    RoomsDAO dao;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mvc = MockMvcBuilders.standaloneSetup(roomsController).build();
    }

    @Test
    public void getRoomsTest() throws Exception {
        this.mvc.perform(get("/v1/hotels/hotel/rooms")).andExpect(status().isOk());
    }

    @Test
    public void getRoomsByIdTest() throws Exception {
        //Mock is empty so 404 is the expected
        this.mvc.perform(get("/v1/hotels/hotel/1/rooms")).andExpect(status().is4xxClientError());
    }
}
