package lesson3_Task1;

public class MainApp {




    public static void main(String[] args) {

        Thread ping = new Thread(new MyRunnablePing());
        Thread pong = new Thread(new MyRunnablePong());

        System.out.println(" Начало игры!!!");


        ping.start();
        pong.start();



//        System.out.println(" Конец игры!!!");

//        MyRunnablePing ping = new MyRunnablePing();
//        Thread ping = new Thread(() -> {
//            MyRunnablePing.printPing();
//        });
//
//        MyRunnablePong pong = new MyRunnablePong();
//        Thread pong = new Thread(() -> {
//            MyRunnablePong.printPong();
//        });








//        System.out.println("Начало игры");

//        ping.start();
//        pong.start();





//        Thread ping = new Thread( new MyRunnablePing());
//        Thread pong = new Thread(new MyRunnablePong());

//        public void printPing() {
//            synchronized (mon) {
//                try {
//                    for (int i = 0; i < 10; i++) {
//                        while (currentLine != "ping") {
//                            mon.wait();
//                        }
//                        System.out.println("ping");
//                        currentLine = "pong";
//                        mon.notify();
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        public void printPong() {
//            synchronized (mon) {
//                try {
//                    for (int i = 0; i < 10; i++) {
//                        while (currentLine != "pong") {
//                            mon.wait();
//                        }
//                        System.out.println("pong");
//                        currentLine = "ping";
//                        mon.notify();
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//
//
//        System.out.println("Конец игры");

    }
}
