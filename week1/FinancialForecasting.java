class FinancialForecasting {

    public static double calculateFutureValue(double presentValue, double growthRate, double periods) {
        if (periods == 0)
            return presentValue;
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }
}

class MainApp {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05;
        double periods = 10;

        double futureValue = FinancialForecasting.calculateFutureValue(presentValue, growthRate, periods);

        System.out.println("future value: " + futureValue);
    }
}