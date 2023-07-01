import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    public static void main(String[] args) {
        int [] arr = {4, 3, 1, 9, 7, 2, 5, 6, 8};
bubbleSort(arr);
    }
    public  static void bubbleSort(int[] sortArr){
        Logger logger =Logger.getLogger(Task2.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {

                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
                logger.log(Level.INFO, "итерация i = "+i+"; итерация j = "+j+"; массив: "+Arrays.toString(sortArr));
            }
        }
    }

}
