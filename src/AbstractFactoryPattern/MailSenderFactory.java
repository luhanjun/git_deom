package AbstractFactoryPattern;
/**
 * 邮件的工厂
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
