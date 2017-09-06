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

    public Example(double primaryForce, double secondaryForce, double mass, int delay) {
        this._primaryForce = primaryForce;
        this._secondaryForce = secondaryForce;
        this._mass = mass;
        this._delay = delay;
    }

    double getDistanceTravelld(int time) {
        if (secondaryTime(time) > 0) {
            return primaryDistance(time) + secondaryDistance(time);
        } else {
            return primaryDistance(time);
        }
    }

    private double secondaryDistance(int time) {
        return primaryVel() * secondaryTime(time) + 0.5 * secondaryAcc() * secondaryTime(time) * secondaryTime(time);
    }

    private double primaryDistance(int time) {
        return 0.5 * primaryAcc() * primaryTime(time) + primaryTime(time);
    }

    private double primaryVel() {
        return primaryAcc() * _delay;
    }

    private int secondaryTime(int time) {
        return time - _delay;
    }

    private int primaryTime(int time) {
        return Math.min(time, _delay);
    }

    private double secondaryAcc() {
        return (_primaryForce + _secondaryForce) / _mass;
    }

    private double primaryAcc() {
        return _primaryForce / _mass;
    }
}
