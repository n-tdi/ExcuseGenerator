import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> listData = new ArrayList<String>();
        Gson gson = new Gson();
        File jsonFile = new File("src/data.json");
        //listData.add(gson.fromJson(jsonFile, "intro"));

    }
}
