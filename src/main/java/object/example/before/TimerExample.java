package object.example.before;

public class TimerExample {

    // 이 메소드가 중점
    public void checkTime() {
        Timer t = new Timer();

        // 데이터 직접 사용
        t.startTime = System.currentTimeMillis();

        // 데이터 직접 사용
        t.stopTime = System.currentTimeMillis();

        // 데이터 직접 사용
        long elapsedTime = t.startTime - t.stopTime;
    }

}

class Timer {
    public long startTime;
    public long stopTime;
}
