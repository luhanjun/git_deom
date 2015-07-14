package MediatorPattern;
/**
 * 中介者模式
 * @author admin
 *
 */
public class Test {

	public static void main(String[] args) {
	    Mediator mediator = new MyMediator();  
        mediator.createMediator();  
        mediator.workAll();  
	}

}
