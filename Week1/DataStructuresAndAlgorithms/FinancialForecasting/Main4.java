import java.util.Scanner;
public class Main4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Investment (₹): ");
        double initialValue = sc.nextDouble();
        System.out.print("Enter Annual Growth Rate (like 10%): ");
        double growthRate = sc.nextDouble();
        System.out.print("Enter Number Of Years: ");
        int year = sc.nextInt();
        double futureValueRec = ForecastCalculator.calculateFutureValue(year, initialValue, growthRate);
        System.out.println("Future Value (Recursion): ₹" + futureValueRec);
        double[] memo = new double[year + 1];
        double futureValueMemo= ForecastCalculator.calculateFutureMemo(year, initialValue, growthRate, memo);
        System.out.println("Future Value (Memoization): ₹" + futureValueMemo);
        double futureValueIter = ForecastCalculator.calculateIteratively(year, initialValue, growthRate);
        System.out.println("Future Value (Iteratively): ₹" + futureValueIter);
    }
}
