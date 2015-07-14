package ProxyPattern;
/**
 * 被代理类
 * @author admin
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("source method");

	}

}
