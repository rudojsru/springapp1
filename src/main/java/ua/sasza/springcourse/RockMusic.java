package ua.sasza.springcourse;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

 public class RockMusic implements Music {
    List rock =new ArrayList();


    @Override
    public List getSong() {

        rock.add("rock1 rok1 rock 1");
        rock.add("rock2 rok2 rock 2");
        rock.add("rock3 rok3 rock 3");
        return rock;
    }
}
