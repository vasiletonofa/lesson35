import java.util.concurrent.atomic.AtomicInteger;

public class Contor {

    public static Integer count = 0;

    public void increment() {

        synchronized (Contor.class) {
            count = count + 1;
            System.out.println(count);
        }
    }

    public static synchronized Integer getCount() {

        synchronized (Contor.class) {

        }

        return count;
    }

}
