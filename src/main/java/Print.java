public class Print extends Thread {

    String msg;
    static Object monitor = new Object();

    public Print(String msg) {
        this.msg = msg;
    }




//    private int counter = 0;
//    public synchronized void printA()
//    {
//        while (counter < 1) {
//            try {
//                wait();
//            } catch (InterruptedException e) {}
//        }
//        counter--;
//        System.out.println("-1 : товар забрали");
//        System.out.println("товара на складе : " + counter);
//        notify();
//    }
//    public synchronized void printB() {
//        while (counter >= 5) {
//            try {
//                wait();
//            }catch (InterruptedException e) {}
//        }
//        counter++;
//        System.out.println("+1 : товар добавили");
//        System.out.println("товара на складе : " + counter);
//        notify();
//    }
//
//    public synchronized void printC() {
//        while (counter >= 3) {
//            try {
//                wait();
//            }catch (InterruptedException e) {}
//        }
//        counter++;
//        System.out.println("+1 : товар добавили");
//        System.out.println("товара на складе : " + counter);
//        notify();
//    }


    @Override
    public void run() {
        int cnt = 5;
        for (int i = 0; i < cnt; i++) {
            synchronized (monitor) {
                while (!this.msg.equals(msg)){
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(msg);
                monitor.notifyAll();
            }
        }
    }


//    public void tryPrint() {
//  //      for (int i = 1; i < 5; i++) {
//            try {
//                printA(msg);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//   //     }
//    }




    public synchronized void printA(String messg) throws InterruptedException {
        while (!messg.equals(msg)){
            wait();
        }
//        for (int i = 0; i < 5; i++) {
//            try {
                System.out.println(messg);
                Thread.sleep(100);
              //  wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        notifyAll();
    }
}
