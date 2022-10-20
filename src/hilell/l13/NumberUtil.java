package hilell.l13;

public class NumberUtil {

    public Result checkNumber(int number) {

        Result result = Result.ZERO;

        if (number > 0) {
            result = Result.POSITIVE;
        } else if (number < 0) {
            result = Result.NEGATIVE;
        }

        return result;

    }
}
