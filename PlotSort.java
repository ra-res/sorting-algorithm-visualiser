import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class PlotSort extends Plot{

    Sort s;

    public PlotSort(){
        s = new Sort();
    }

    public static void sleepFor(long nanoseconds){
        long timeElapsed;
        final long startTime = System.nanoTime();
        do {
            timeElapsed = System.nanoTime() - startTime;
        } while(timeElapsed < nanoseconds);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;


        for( int i = 0; i < s.a.length; i++) {
            g.setColor(Color.BLACK);

            g.drawLine(i, scaleY(0), i, s.a[i]);
        }
        for (int i = 0; i < s.a.length; i++) {
            for (int j = 0; j < s.a.length-1-i; j++) {
                if(s.a[j]>s.a[j+1]) {
                    int temp=s.a[j];
                    s.a[j]=s.a[j+1];
                    s.a[j+1]=temp;
                    g.setColor(Color.YELLOW);
                    g.drawLine(i, scaleY(0), i, s.a[i]);
                }
            }
            try {
                TimeUnit.SECONDS.sleep(1/20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void sort(){
        int count = 0;
        for (int i = 0; i < s.a.length; i++) {
            for (int j = 0; j < s.a.length-1-i; j++) {
                count++;
                if(s.a[j]>s.a[j+1]) {
                    int temp=s.a[j];
                    s.a[j]=s.a[j+1];
                    s.a[j+1]=temp;
                    sleepFor(10000000);
                    repaint();
                }
            }
        }
    }

}
