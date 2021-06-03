package by.test;

import java.util.Collections;
import java.util.List;


public class RapMusic implements Music{
    @Override
    public List<?> getSong() {
        return Collections.singletonList("Rap music");
    }
}
