public class FinancialForecasting {

    /**
     * Calculates the future value of an investment recursively.
     * Formula: Future Value = Present Value * (1 + Growth Rate)^Years
     *
     * @param presentValue The initial value.
     * @param annualGrowthRate The annual growth rate (e.g., 0.05 for 5%).
     * @param years The number of years to forecast.
     * @return The future value.
     */
    public static double calculateFutureValue(double presentValue, double annualGrowthRate, int years) {
        // Base Case: If years is 0, the future value is the present value
        if (years == 0) {
            return presentValue;
        }

        // Recursive Step: Calculate value for one less year and apply growth for the current year
        // The value for the previous year (years - 1) is presentValue * (1 + annualGrowthRate)^(years - 1)
        // So, for 'years', it will be (value at years-1) * (1 + annualGrowthRate)
        return calculateFutureValue(presentValue, annualGrowthRate, years - 1) * (1 + annualGrowthRate);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% annual growth
        int forecastYears = 10;

        System.out.println("--- Financial Forecasting (Recursive) ---");
        System.out.printf("Initial Value: $%.2f\n", initialValue);
        System.out.printf("Annual Growth Rate: %.2f%%%n", growthRate * 100);
        System.out.printf("Forecast Years: %d%n", forecastYears);

        double futureValue = calculateFutureValue(initialValue, growthRate, forecastYears);
        System.out.printf("\nFuture Value after %d years: $%.2f%n", forecastYears, futureValue);

        // Example with 0 years
        System.out.println("\n--- Example with 0 years ---");
        double futureValue0Years = calculateFutureValue(initialValue, growthRate, 0);
        System.out.println(String.format("Future Value after %d years: $%.2f", 0, futureValue0Years));

        // Example with different values
        System.out.println("\n--- Another Example ---");
        double value2 = 500.0;
        double rate2 = 0.10; // 10%
        int years2 = 5;
        double futureValue2 = calculateFutureValue(value2, rate2, years2);
        System.out.printf("Initial Value: $%.2f, Rate: %.2f%%, Years: %d -> Future Value: $%.2f%n",
                value2, rate2 * 100, years2, futureValue2);
    }
} 