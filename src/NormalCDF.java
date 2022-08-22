import javax.swing.JOptionPane;

public class NormalCDF {
	
	public double Prob;
	
	public static double compute(double Z, double M, double SD){
		double Prob = 0;
		try{
			
			if (SD < 0) {
				JOptionPane.showMessageDialog(null, "The standard deviation must be positive.");
			} else if (SD == 0) {
			    if (Z < M){
			        Prob = 0;
			    } else {
				    Prob = 1;
				}
			} else {
				Prob = normalCDF((Z-M)/SD);
			}
		}catch(Exception e){
			e.getMessage();
		}
		
		return Prob;
	}
	
	public static double normalCDF(double X){
			double T=1/(1 + .2316419 * Math.abs(X));
			double D = .3989423 * Math.exp(-X * X / 2);
			double Prob = D * T * (.3193815 + T * (-.3565638 + T * (1.781478 + T * (-1.821256 + T * 1.330274))));
			
			if (X > 0) {
				Prob = 1 - Prob;
			}
		return Prob;
	}
}
