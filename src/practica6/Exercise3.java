package practica6;

public interface Exercise3{
	
	public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator);

	public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator);

	public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator);

	public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator);

	public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator);

	public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator);

	public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator);

	public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator);

	public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator);

	public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator);

	public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator);

	public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator);

	public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator);
}