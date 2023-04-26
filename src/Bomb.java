class Bomb extends Thread implements Runnable {
        String name;
        int timeToWait;
        public Bomb(String name, int timeToWait) {
            this.name = name;
            this.timeToWait = timeToWait;
        }
        public void run() {
            try { Thread.sleep(timeToWait);    } catch (Exception e) {    }
            System.out.println(name + " exploded");
        }
    }