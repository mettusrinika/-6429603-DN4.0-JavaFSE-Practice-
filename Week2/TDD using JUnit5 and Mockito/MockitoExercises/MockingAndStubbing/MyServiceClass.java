public class MyServiceClass
{
private ExternalApi1 api;
public MyServiceClass(ExternalApi1 api)
{
this.api = api;
}
public String fetchData()
{
return api.getData();
}
}