package FactoryPatterns;
/**
 * ������Ϣ�Ĺ�������̬���������
 * @author admin
 *
 */
public class StaticSenderFactory {

		public static ISender produceMailSender(){
			return new MailSender();
		}
		public static ISender produceSmsSender(){
			return new SmsSender();
		}
}
