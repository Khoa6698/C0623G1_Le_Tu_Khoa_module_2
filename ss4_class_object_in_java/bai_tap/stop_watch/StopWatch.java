package ss4_class_object_in_java.bai_tap.stop_watch;

import java.time.Duration;
import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public StopWatch() {
        this.startTime = LocalDateTime.now();
    }

    public void start() {
        this.startTime = LocalDateTime.now();
    }

    public void stop() {
        this.endTime = LocalDateTime.now();
    }

    public long getElapsedTime() {
        Duration duration = Duration.between(getStartTime(), getEndTime());
        return duration.toMillis();
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

}
