import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Sort{
    int [] a;

    int barX, barY, barWidth, barLength = 1;

    public Sort() {
        a = new int[1000];
        for (int i = 0; i < 1000; i++) {
            a[i] = i;
        }
        shuffleArray();
    }

    public void shuffleArray(){
        Random rnd = ThreadLocalRandom.current();
        for (int i = a.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

    public void printArray(){
        for (int i = 0; i<a.length ; i++){
            System.out.println(a[i]);
        }
    }
}



