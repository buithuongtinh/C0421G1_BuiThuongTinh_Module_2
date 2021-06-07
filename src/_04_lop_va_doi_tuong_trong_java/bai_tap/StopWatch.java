package _04_lop_va_doi_tuong_trong_java.bai_tap;

import java.time.LocalTime;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    public StopWatch(long startTime, long endTime) {
        this.startTime =  System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime =  System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long miliSecond = this.endTime - this.startTime;
        return miliSecond ;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian");
        System.out.println("Thời gian hiện tại: " + stopWatch.getStartTime());

        for (int i = 1; i <= 1000000; i++)
            stopWatch.stop();
        System.out.println("Thời gian kết thúc: " + stopWatch.getEndTime());
        System.out.println("Số mili giây đếm đc: " +stopWatch.getElapsedTime());
    }
}



