public class MyServiceClass1
{
private ExternalApi1 api;
public MyServiceClass1(ExternalApi1 api)
{
this.api = api;
}
public String fetchData()
{
return api.getData();
}
}