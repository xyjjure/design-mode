package FacadeMode.Pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by leon on 2017/7/25.
 */
public class DataBase {
    private DataBase(){

    }

    public static Properties getProperties(String dbName){
        String fileName = dbName + ".txt";
        Properties prop = new Properties();
        try{
            prop.load(new FileInputStream(fileName));
        }catch (IOException e){
            System.out.println("Warning:" +fileName+ "id not found");
        }
        return prop;
    }
}
