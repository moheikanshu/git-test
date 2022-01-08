package org.example;

public class VolatileMemoryVisibility {
    private volatile int i;
    public void ChangeI(){
        this.i = 100;
    }

    public static void main(String[] args) {
        VolatileMemoryVisibility vb = new VolatileMemoryVisibility();
        new Thread( () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            vb.ChangeI();
            System.out.println("子线程改变了I的值！");
        }).start();
        while(vb.i == 0){
        }
        System.out.println("main线程感知到i的变化");
    }
}
