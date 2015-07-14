package ObserverPattern;

public class MySubject extends AbstractSubjec {

	@Override  
    public void operation() {  
        System.out.println("update self!");  
        notifyObservers();  
    }  

}
