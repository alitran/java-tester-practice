package selection_and_decision.if_else;

public class CalculateBMIAndDetermineHealthStatus {
    /**
     * Write a program that calculates Body Mass Index (BMI) and determines the health
     * status based on the BMI value:
     * BMI = weight (kg) / (height (m) * height (m))
     * Underweight: BMI < 18.5
     * Normal weight: 18.5 <= BMI < 24.9
     * Overweight: 24.9 <= BMI < 29.9
     * Obesity: BMI >= 30
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        calculateBMI(68, 1.75);  // Output: Normal weight
        calculateBMI(95, 1.75);  // Output: Obesity
    }
}
