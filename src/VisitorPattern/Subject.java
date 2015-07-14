package VisitorPattern;

public interface Subject {
	/**
	 * accept方法，接受将要访问它的对象，getSubject()获取将要被访问的属性，
	 * @param visitor
	 */
	  public void accept(Visitor visitor);  
	    public String getSubject();  
}
