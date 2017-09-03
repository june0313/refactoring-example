package chapter06._06_split_temporary_variable.example;

/**
 * Created by wayne on 2017. 9. 4..
 * <p>
 * Split Temporary Variable (임시변수 분리)
 * <p>
 * 루프 변수나 값 누적용 변수가 아닌 임시변수에 여러 번 값이 대입될 땐
 * - 각 대입마다 다른 임시변수를 사용하자.
 */
public class Example {
    private double _primaryForce;
    private double _secondaryForce;
    private double _mass;
    private int _delay;

    double getDistanceTravelld(int time) {
        double result;
        double acc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);

        result = 0.5 * acc * primaryTime + primaryTime;

        int secondaryTime = time - _delay;

        if (secondaryTime > 0) {
            double primaryVel = acc * _delay;
            acc = (_primaryForce + _secondaryForce) / _mass;
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }

        return result;
    }
}
