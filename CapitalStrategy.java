package exercicio_template;

public abstract class CapitalStrategy {
	
	
	public abstract double capital(Loan loan){
		return 0;
	}
	
	public double duration(Loan loan){
		return 0;
	}
	
	protected double capitalTemplate(Loan loan){
		return duration(loan) * riskFactorFor(loan) * capital(loan);
	}
	
	protected double riskFactorFor(Loan loan){
		return 2*4*0.3;
	}
	

}
