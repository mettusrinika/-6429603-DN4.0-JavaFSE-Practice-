import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest
{
@Test
public void testExternalApi()
{
ExternalApi1 mockApi = mock(ExternalApi1.class);
when(mockApi.getData()).thenReturn("Mocked Data");
MyServiceClass1 serv = new MyServiceClass1(mockApi);
String res = serv.fetchData();

assertEquals("Mock data", res);
}
}