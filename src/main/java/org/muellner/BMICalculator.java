package org.muellner;

public class BMICalculator {
    private double weightInKg;
    private double heightInMeter;



    public BMICalculator(double weightInKg, double heightInMeter) {
        this.weightInKg = weightInKg;
        this.heightInMeter = heightInMeter;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public double getHeightInMeter() {
        return heightInMeter;
    }

    private double calculateBMI(){
        return weightInKg / (heightInMeter * heightInMeter);
    }

    /** BMI Grenzen
    < 18.5 underweight
     18.5 - 25 normal
     25 - 30 overweight
     > 30 obese
    **/
    public String result() {
        double bmi = calculateBMI();

        if (bmi < 18.5) {
            return "underweight";
        } else if (bmi < 25) {
            return "normal";
        } else if (bmi < 30) {
            return "overweight";
        } return "obese";
    }


}
