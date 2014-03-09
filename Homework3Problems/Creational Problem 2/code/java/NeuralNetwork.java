/**
* NeuralNetwork.java
*
* An abstract NN class.  You may extend this class to solve your problem,
* or use it as a guide, but the API must remain consistent.
*/

abstract class NeuralNetwork
{
   private double[] weights;

   public NeuralNetwork() {
   	this.weights = new double[4];
   	for (short i = 0; i < 4; i++) { weights[i] = i; }
   }

   public void learn() {
   	for (short i = 0; i < 4; i++) { weights[i] += i%2; }
   }

   public double respond() {
   	double sum = 0;
   	for (short i = 0; i < 4; i++) { sum += weights[i]; }
   	return sum;
   }

   public abstract NeuralNetwork clone();
}

