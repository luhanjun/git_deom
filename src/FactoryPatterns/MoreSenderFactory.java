package FactoryPatterns;
/**
 * 发送信息的工厂(多个工厂模式)
 * @author admin
 *
 */
public class MoreSenderFactory {
	/*
	 *发送邮件的工厂
	 * @return
	 */
	public ISender produceMailSender(){
		return new MailSender();
	}
	/*
	 *发送短信的工厂 
	 * @return
	 */
	public ISender produceSmsSender(){
		return new SmsSender();
	}
}
