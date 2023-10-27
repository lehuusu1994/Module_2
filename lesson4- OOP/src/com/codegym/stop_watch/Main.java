package com.codegym.stop_watch;

public class Main {
    public static void main(String[] args) {
        int[] array = generateArray(100000);
        StopWatch stopwatch = new StopWatch();
        selectionSort(array);
        stopwatch.stop();
        System.out.println("Thời gian thực thi: " + stopwatch.getElapsedTime() + " ms");
        System.out.println("Thời điểm bắt đầu: " + stopwatch.getStartTime() + " ms");
        System.out.println("Thời điểm kết thúc: " + stopwatch.getEndTime() + " ms");
    }

    private static int[] generateArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
