import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    interface ExternalApi {
        String getData();
    }

    class MyService {
        private ExternalApi api;
        public MyService(ExternalApi api) {
            this.api = api;
        }
        public String fetchData() {
            return api.getData();
        }
    }

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
