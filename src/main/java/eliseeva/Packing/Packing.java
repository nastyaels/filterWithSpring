package eliseeva.Packing;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import eliseeva.GetJson.GetJson;
import eliseeva.Person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@Component
public class Packing implements PackingInterface {
    private Type personsList = new TypeToken<List<Person>>(){}.getType();
    @Autowired
    private GetJson getJson = new GetJson();
    @Override
    public List<Person> pack() {
        Gson gson = new Gson();
        String json = new String();
        try {
            json = getJson.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gson.fromJson(json, personsList);
    }
}
