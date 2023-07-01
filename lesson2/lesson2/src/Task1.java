import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
//select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"
public class Task1 {
    public static void main(String[] args) {
        String sqlStr = "select * from students where ";
        String jsonStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder finalStr = new StringBuilder();
        String [] jsonStrArr = jsonStr.split(",") ;
        finalStr.append(sqlStr);
        StringBuilder ns = new StringBuilder();
        ns.append(jsonStrArr[0]);
        ns.replace(0, 1, "");




    }
}