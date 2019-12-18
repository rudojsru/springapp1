package ua.sasza.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazMusic implements Music {
    List jaz=new ArrayList();
    @Override
    public List getSong() {

        jaz.add( "Jaz1 Jaz1 Jaz1");
        jaz.add( "Jaz2 Jaz2 Jaz2");
        jaz.add( "Jaz3 Jaz3 Jaz3");
        return jaz;
    }
}
