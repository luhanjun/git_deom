package AbstractFactoryPattern;
/**
 * �ʼ��Ĺ���
 * @author admin
 *
 */
public class MailSenderFactory implements Provider {

	@Override
	public ISender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
