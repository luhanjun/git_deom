package AbstractFactoryPattern;
/**
 * ���ŵĹ���
 * @author admin
 *
 */
public class SmsSenderFactory implements Provider {

	@Override
	public ISender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
