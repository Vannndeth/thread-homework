public class MainApplication implements Runnable {
    private static final String[] MESSAGES = {
            "Welcome To CSTAD!\n",
            "==================================================\n",
            "Don't give up this opportunity, do your best first\n",
            "--------------------------------------------------\n",
            "Downloading.............Completed 100%.\n"
    };
    @Override
    public void run() {
        for (String message : MESSAGES) {
            try {
                for (int i = 0; i < message.length(); i++) {
                    System.out.print(message.charAt(i));
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MainApplication());
        thread.start();
    }
}
