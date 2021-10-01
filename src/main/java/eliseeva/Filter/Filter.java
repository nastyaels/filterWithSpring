package eliseeva.Filter;

import eliseeva.Person.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Filter implements FilterInterface {
    @Value("${eliseeva.Filter.minAge}")
    private int minAge;
    @Value("${eliseeva.Filter.maxAge}")
    private int maxAge;
    @Value("${eliseeva.Filter.gender}")
    private String gender;
    @Override
    public List<String> filtred (List<Person> persons){
        return persons.stream()
                .filter(person -> person.age >= minAge)
                .filter(person -> person.age <= maxAge)
                .filter(person -> person.gender.equals(gender))
                .map(person -> person.guid)
                .collect(Collectors.toList());
    }
}
