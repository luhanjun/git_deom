package AdapterPattern;
/**
 * ʵ�ֽӿ�������
 * @author admin
 *
 */
public class SourceableSub2 extends Wrapper1 {
		@Override
		public void method2() {
			super.method2();
			System.out.println("SourceableSub2 method2");
		}

}
