public class Main {
    public static void main(String[] args) throws InterruptedException {

        Print pr = new Print("A");
//
        Print pr1 = new Print("B");
        Print pr2 = new Print("C");



        Thread t1 = new Thread(pr);
       // pr.printA("A");
        t1.start();
        Thread t2 = new Thread(pr1);
      //  pr1.printA("B");
        t2.start();
        Thread t3 = new Thread(pr2);
      //  pr2.printA("C");
        t3.start();

//        Print pr = new Print("A");
//        pr.tryPrint();
//        pr.printA("A");
//        pr.printA("B");

//        try {
//            for (int i = 0; i < 5; i++) {
        //        pr.printA("B");
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        Print pr1 = new Print("B");
////        try {
////            for (int i = 0; i < 5; i++) {
//                pr1.printA("B");
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//
//
//        final Main e1 = new Main();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    e1.writeA();
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    e1.writeB();
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                e1.writeC();
//            }
//        }).start();
//
//
//        //    new Thread(writeA).start();
//        //    new Thread(consumer).start();
//        final Object object = new Object();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (object) {
//
//                    try {
//                        for (int i = 0; i < 5; i++) {
//                            System.out.print("A");
//                            ///  System.out.println("Hello World");
//                        }
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("xEnd");
//                }
//            }
//        }).start();
//
//        synchronized(object) {
//            for (int i = 0; i < 5; i++) {
//             //   System.out.print("A");
//                ///  System.out.println("Hello World");
//                printA("A");
//
//            }
//        }
//        synchronized(object) {
//            for (int i = 0; i < 5; i++) {
//                System.out.print("B");
//                ///  System.out.println("Hello World");
//            }
//        }
//
//        synchronized(object) {
//            for (int i = 0; i < 5; i++) {
//                System.out.print("C");
//                ///  System.out.println("Hello World");
//            }
//        }


//        Thread t = new Thread(new Runnable(){
//            public void run() {
//                printA();
//        }});
//        t.start();
//        t.wait();
//
//        Thread t1 = new Thread(new Runnable()
//        { public void run() {
//            printB();
//        }});
//        t1.start();
//        Thread t2 = new Thread(new Runnable()
//        { public void run() {
//            printC();
//        }});
//        t2.start();


    }

    public synchronized void printA(String msg) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(msg);
                Thread.sleep(100);
                //wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // System.out.println(Thread.currentThread().getName());
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//          //  System.out.println("m2");
        }
      //  notifyAll();
    }

    public static synchronized void printB() {
        System.out.println("B");
    }

    public static synchronized void printC() {
        System.out.println("C");
    }


    public synchronized void writeA() {
        for (int i = 0; i < 5; i++) {
        try {
            System.out.println("A");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
             }
        notify();
    }

    public synchronized void writeB() {
        for (int i = 0; i < 5; i++) {
        try {
            System.out.println("B");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
              }
        //   System.out.println("C1");

        notify();
    }

    public synchronized void writeC() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("C");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //  System.out.println("C1");

        notifyAll();

    }



//    Thread чел2 = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("Чел2 подошел к стулу 1");
//            synchronized (стул1) {
//                System.out.println("Чел2 сел на стул1");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Чел2 встал со стула1");
//            }
//        }
//    });
//        чел2.start();
//
//    Thread чел3 = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("Чел3 подошел к стулу 2");
//            synchronized (стул2) {
//                System.out.println("Чел3 сел на стул2");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Чел3 встал со стула2");
//            }
//        }
//    });
//        чел3.start();
}


