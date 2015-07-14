package StrategyPattern;

public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calcute(String exp) {
		 int arrayInt[] = split(exp,"-");  
	     return arrayInt[0]-arrayInt[1]; 
	}

}
