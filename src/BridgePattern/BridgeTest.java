package BridgePattern;

public class BridgeTest {
	
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		/**
		 * ����source1����
		 */
		Sourceable source1=new Source1();
		bridge.setSource(source1);
		bridge.method();
	}
	
	

}
