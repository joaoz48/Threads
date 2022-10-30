public class ThreadContadora extends Thread{
    String nomeThread;

    public ThreadContadora(String nomeThread) {
        this.nomeThread = nomeThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(this.nomeThread + " - " + i);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}
