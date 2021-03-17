package Session1;

public class Order implements ProcessOrder{
	public void OrderProcess(String modelname)
	{
		System.out.println(modelname + " order accepted.");
	}
}
