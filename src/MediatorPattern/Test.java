package MediatorPattern;
/**
 * �н���ģʽ
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
