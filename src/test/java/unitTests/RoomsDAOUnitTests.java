package unitTests;

import app.models.RoomsDAO;
import app.models.RoomsRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class RoomsDAOUnitTests {

    @Mock
    RoomsRepository mock;
    RoomsDAO dao;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        dao = new RoomsDAO(mock);
    }

    @Test
    public void findAll() {
        // GIVEN
        // WHEN
        dao.findAll();
        // THEN
        Mockito.verify(mock).findAll();
    }
}
