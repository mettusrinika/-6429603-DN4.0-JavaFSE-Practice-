public class ForecastCalculator
{
    public static double calculateFutureValue(int year, double initialValue, double growthRate)
    {
        if (year == 0)
        {
            return initialValue;
        }
        return calculateFutureValue(year - 1, initialValue, growthRate) * (1 + growthRate);
    }
    public static double calculateFutureMemo(int year, double initialValue, double growthRate, double[] memo)
    {
        if (year == 0)
        {
            return initialValue;
        }
        if (memo[year] != 0)
        {
            return memo[year];
        }
        memo[year] = calculateFutureMemo(year - 1, initialValue, growthRate, memo) * (1 + growthRate);
        return memo[year];
    }
    public static double calculateIteratively(int year, double initialValue, double growthRate)
    {
        double res = initialValue;
        for(int i = 0; i < year; i++)
        {
            res *= (1 + growthRate);
        }
        return res;
    }
}
