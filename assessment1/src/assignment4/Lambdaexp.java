package assignment4;

public class Lambdaexp {
@FunctionalInterface
	public interface Operator {
	 public void operate(int num);
	}
    public static void main(String[] args) {
	  Operator op = num -> System.out.println("Increasing num by 2:"+(num+2));
	  op.operate(10);
	 }
		
	}


