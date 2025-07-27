import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class MyServiceInteractionTest
{
@Test
public void testVerifyInteraction()
{
ExternalApi1 mockApi = mock(ExternalApi1.class);
MyServiceClass1 serv = new MyServiceClass1(mockApi);

serv.fetchData();

verify(mockApi).getData();
}
}