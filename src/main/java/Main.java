import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            Reader reader = new FileReader("/Users/ampazz/Documents/study-project/src/main/resources/Person.json");
            PeopleV1 peopleV1 = gson.fromJson(reader, PeopleV1.class);
            PeopleV2 peopleV2 = new PeopleV2();
            peopleV1.getPeople();
            for (PersonV1 personV1 : peopleV1.getPeople()) {
                String[] s = personV1.name.split(" ");
            }

            for (PersonV1 person : peopleV1.getPeople()) {
                System.out.println(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
