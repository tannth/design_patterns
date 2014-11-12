import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class AdditionClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdditionInterface hello;
		try {
			System.setSecurityManager(new RMISecurityManager());
			hello = (AdditionInterface) Naming.lookup("rmi://localhost/ABC");
			int result = hello.Add(9, 10);
			System.out.println("Result is :" + result);

		} catch (Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}
}