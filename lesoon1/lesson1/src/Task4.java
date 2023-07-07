import java.util.Arrays;

    public class Task4 {
        public static void main(String[] args) {
            String inputStr = "2? + ?5 = 69";
            findSolution(inputStr);

        }
        public static boolean findSolution(String inputStr){
            String [] arrStr = inputStr.split(" ");
            Arrays.toString(arrStr);
            for(int i = 0; i < 10; i++){
                for(int j = 0; j<10; j++){
                    int q = Integer.parseInt(arrStr[0].replace("?", String.valueOf(i)));
                    int w = Integer.parseInt(arrStr[2].replace("?", String.valueOf(j)));
                    if(q+w==Integer.parseInt(arrStr[4])){
                        System.out.println(q + " + " + w + " = " + Integer.parseInt(arrStr[4]));
                        return true;
                    }
                }
            }
            System.out.println("нет решений");
            return false;
        }



    }

