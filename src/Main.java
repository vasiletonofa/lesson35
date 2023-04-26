import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main extends Object {
    public static void main(String[] args) {  // MainThread


//        List<String> stringList = new ArrayList<>();
//        stringList.add("Hello"); // 1 min  ->  Thread1
//        stringList.add("World"); // 1 min  ->  Thread2
//        stringList.add("World"); // 1 min  ->  Thread3        // 1 min
//        stringList.add("World"); // 1 min  ->  Thread4
//        stringList.add("World"); // 1 min  ->  Thread5
//        stringList.add("World"); // 1 min  ->  Thread2
//
//        // 5 cores
//
//        // 500 threads
//
//        // Thread1 -> Core1
//        // Thread2 -> Core2
//        // Thread3 -> Core3
//        // Thread4 -> Core4
//        // Thread5 -> Core5
//
//        int cores = Runtime.getRuntime().availableProcessors();
//
//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5); // creaza thread-uri cate ii trebuie
//        try {
//            for (String element : stringList) {
//
//                Runnable runnable = () -> {
//                    try {
//                        Thread.sleep(2000);
//                        System.out.println(element);
//                    } catch (Exception e) {
//
//                    }
//                };
//
//                executorService.schedule(runnable, 5, TimeUnit.MINUTES);
//            }
//
//        } finally {
//            executorService.shutdown();
//        }
//
//
//        // 1 -> 2 -> 3 -> 4
//
//
//        System.out.println("Hello"); // 5
//        System.out.println("World"); // 5
//
//        // Hello -> World - Sincron -> 10 min
//
//
//        // 4   5
//        // 3   5
//        // 2   5   ->   Asincron
//        // 1   5
//
//        // Sincron:   20 min
//        // Asincron:  5 min


        // Thread1
        // Thread2
        // Thread3
        // Thread4 -> Synchronized {}





//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        try {
//            for(int i = 0; i < 10; i++) {
//                executorService.execute(() -> new Contor().increment());
//            }
//        } finally {
//            executorService.shutdown();
//        }
//
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//
//        }
//
//
//        System.out.println("Contor final: " + new Contor().getCount());


        Bomb b1 = new Bomb("Bomb 1", 2500);  // 2500  -> Thread1
        Bomb b2 = new Bomb("Bomb 2", 1000);  // exploded -> MainThread
        Bomb b3 = new Bomb("Bomb 3", 500);  // 500 -> Thread2
        b1.start();
        b2.run();
        new Thread(b3).start();
    }


}