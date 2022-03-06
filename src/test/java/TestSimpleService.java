import com.springbootReactiveProgramming.springbootreactiveprogramming.domain.Dish;
import com.springbootReactiveProgramming.springbootreactiveprogramming.service.KitchenService;
import com.springbootReactiveProgramming.springbootreactiveprogramming.service.SimpleServer;
import org.junit.jupiter.api.Test;

public class TestSimpleService {

    @Test
    public void testSimpleService() {

        KitchenService kitchenService = new KitchenService();
        SimpleServer simpleServer = new SimpleServer(kitchenService);

        System.out.println(simpleServer.doingMyJob());
    }

}
