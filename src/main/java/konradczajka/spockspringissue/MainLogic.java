package konradczajka.spockspringissue;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainLogic {

    @Autowired
    private NumberProvider provider;

    public int doubleIt() {
        return provider.get() * 2;
    }
}