package CommandPattern;
/**
 * ÃüÁîÄ£Ê½
 * @author admin
 *
 */
public class Test {

	public static void main(String[] args) {
		Receiver receiver=new Receiver();
		Command command=new MyCommand(receiver);
		Invoker invoker=new Invoker(command);
		
		invoker.action();

	}

}
