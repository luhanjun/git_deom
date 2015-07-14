package FactoryPatterns;
/**
 * 发送信息的工厂(简单工厂模式)
 * @author admin
 *
 */
public class CommonSenderFactory {
	/**
	 * 生产一个操作给发起者
	 * @param type 传入的操作类型
	 * @return
	 */
	public ISender produce(String type){
		ISender sender=null;
		if("mail".equals(type)){
			sender=new MailSender();
		}else if("sms".equals(type)){
			sender=new SmsSender();
		}else{
			System.out.println("请输入正确的操作类型");
			return null;
		}
		return sender;
	}

}
