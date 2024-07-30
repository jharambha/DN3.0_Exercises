public class FinancialForecasting {

   
    public static double calculateFutureValue(double principal, double rate, int periods) {
       
        if (periods == 0) {
            return principal;
        }
        
        return calculateFutureValue(principal * (1 + rate), rate, periods - 1);
    }

    public static void main(String[] args) {
        double principal = 1000.0; 
        double rate = 0.05;        
        int periods = 10;          

        double futureValue = calculateFutureValue(principal, rate, periods);
        System.out.printf("Future value after %d years: %.2f%n", periods, futureValue);
    }
}
