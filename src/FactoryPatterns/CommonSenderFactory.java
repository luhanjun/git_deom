package FactoryPatterns;
/**
 * ������Ϣ�Ĺ���(�򵥹���ģʽ)
 * @author admin
 *
 */
public class CommonSenderFactory {
	/**
	 * ����һ��������������
	 * @param type ����Ĳ�������
	 * @return
	 */
	public ISender produce(String type){
		ISender sender=null;
		if("mail".equals(type)){
			sender=new MailSender();
		}else if("sms".equals(type)){
			sender=new SmsSender();
		}else{
			System.out.println("��������ȷ�Ĳ�������");
			return null;
		}
		return sender;
	}

}
