public class Main {
    public static void main(String[] args) {

        //Criando Theads contadoras
        ThreadContadora t1 = new ThreadContadora("Thread 1");
        ThreadContadora t2 = new ThreadContadora("Thread 2");
        ThreadContadora t3 = new ThreadContadora("Thread 3");

        //Iniciando as Threads
        t1.start();
        t2.start();
        t3.start();
    }
}