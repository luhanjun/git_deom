package FactoryPatterns;
/**
 * ������Ϣ�Ĺ���(�������ģʽ)
 * @author admin
 *
 */
public class MoreSenderFactory {
	/*
	 *�����ʼ��Ĺ���
	 * @return
	 */
	public ISender produceMailSender(){
		return new MailSender();
	}
	/*
	 *���Ͷ��ŵĹ��� 
	 * @return
	 */
	public ISender produceSmsSender(){
		return new SmsSender();
	}
}
