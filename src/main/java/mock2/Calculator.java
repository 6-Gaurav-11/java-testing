package mock2;

public class Calculator {
	CalcService cs;
	Calculator(CalcService cs){
		this.cs=cs;
	}
	
	public int doThis(int a, int b) {
		return cs.add(a,b)*a*b;   //doing this operation via add() of CalcService
//		return (a+b)*a*b;        // hardcoding without using add(), verify() -> "Wanted but not invoked"
	}
}
