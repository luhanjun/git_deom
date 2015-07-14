package AdapterPattern;
/**
 * 实现接口适配器
 * @author admin
 *
 */
public class SourceableSub1 extends Wrapper1 {
	@Override
	public void method1() {
		super.method1();
		System.out.println("SourceableSub1 method1");
	}

}
