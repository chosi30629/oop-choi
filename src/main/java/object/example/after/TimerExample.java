package object.example.after;

import java.util.concurrent.TimeUnit;

public class TimerExample {

    // 이 메소드가 중점
    public void checkTime() {
        // 내부 데이터를 감추고 기능으로 구현
        Timer t = new Timer();
        t.start();

        t.stop();
        long time = t.elapsedTime(TimeUnit.MILLISECONDS);
    }

}

class Timer {
    private long startTime;
    private long stopTime;


    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long elapsedTime(TimeUnit unit) {
        switch (unit) {
            case MILLISECONDS:
                return stopTime - startTime;
        }
        return 0;
    }
}
