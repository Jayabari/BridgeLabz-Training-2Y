public class BackgroundJob {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Running job step " + i);
            }
        };
        Thread t = new Thread(task);
        t.start();
    }
}

