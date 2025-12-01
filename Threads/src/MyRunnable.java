public class MyRunnable implements Runnable {
    @Override
    public void run(){
        for(int i = 0; i<=5; i++){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println("Seu programa foi interrompido!");
            }
            if(i == 5) {
                System.out.println("Acabou o tempo!");
                System.exit(0);
            }
        }
    }
}
