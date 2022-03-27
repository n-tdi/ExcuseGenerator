import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listData = new ArrayList<String>();
        Gson gson = new Gson();
        FileReader reader = new FileReader("src/data.json");
        String json = String.valueOf(reader.read());
        String data = gson.fromJson(json, String.class);
        listData.add(data);
        System.out.println(listData);
    }
}
