package DecoratorPattern;
/**
 * 装饰的类（装饰模式）
 * @author admin
 *
 */
public class Decorator implements Sourceable {
	//获取Source的实例
	private Source source;
	
	public Decorator(Source source){
		this.source=source;
	}

	@Override
	public void method() {
		//扩展source类中的method方法
		System.out.println("before source method");
		source.method();
		System.out.println("after source  method");

	}

}
