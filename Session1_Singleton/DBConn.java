package Session1_Singleton;

public class DBConn {
	
	public static DBConn instance = null;
	
	private DBConn() {}
	
	public static DBConn getInstance() {
		if(instance == null)
			instance = new DBConn();
		
		return instance;
	}

}
