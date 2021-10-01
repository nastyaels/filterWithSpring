package eliseeva;

import eliseeva.Filter.Filter;
import eliseeva.Packing.Packing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parse {
    @Autowired
    Filter f = new Filter();
    @Autowired
    Packing p = new Packing();

    public void parseFile(){
        System.out.println(f.filtred(p.pack()));
    }
}
