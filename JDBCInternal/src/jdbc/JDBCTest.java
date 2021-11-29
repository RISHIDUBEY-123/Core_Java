package jdbc;


interface MyStatement {
boolean execute(String SQLQuery);
}
interface MyConnection {
MyStatement createMyStatement();
}
	
class MyDriverManager{
		static MyConnection getConnection(String type) {
			if(type.equals("My SQL")) {
				return new MySQLConnection();
			}else {
				return new MyOracleConnection();
			}
		}
	}
	class MySQLStatement implements MyStatement{
		public boolean execute(String SQLQuery) {
			System.out.println("SQL Query exceute data stored in MySQL");
			return true;
		}
	}
	class MyOracleStatement implements MyStatement{
		public boolean execute(String OracleQuery) {
			System.out.println("Oracle Query exceute data stored in MySQL");
			return true;
		}
	}
	class MySQLConnection implements MyConnection{
		public MyStatement createMyStatement() {
			System.out.println("My SQL Connection create MySQL Object ");
			return new MySQLStatement();
		}
		
	}
	class MyOracleConnection implements MyConnection{
		public MyStatement createMyStatement() {
			System.out.println("My Oracle Connection create MySQL Object ");
			return new  MyOracleStatement();
		}
		
	}
	public class JDBCTest {

	public static void main(String[] args) {
		MyConnection mcon=MyDriverManager.getConnection("My SQL");
		MyStatement mst=mcon.createMyStatement();
		mst.execute("MySQL");
		}
}