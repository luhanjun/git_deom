package DecoratorPattern;
/**
 * װ�ε��ࣨװ��ģʽ��
 * @author admin
 *
 */
public class Decorator implements Sourceable {
	//��ȡSource��ʵ��
	private Source source;
	
	public Decorator(Source source){
		this.source=source;
	}

	@Override
	public void method() {
		//��չsource���е�method����
		System.out.println("before source method");
		source.method();
		System.out.println("after source  method");

	}

}
