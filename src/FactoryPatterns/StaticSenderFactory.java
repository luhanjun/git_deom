package FactoryPatterns;
/**
 * 发送信息的工厂（静态多个工厂）
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
