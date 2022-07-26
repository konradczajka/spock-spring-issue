package konradczajka.spockspringissue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpockSpringIssueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpockSpringIssueApplication.class, args);
    }
}

@Component
class MainLogic {

    @Autowired
    private NumberProvider provider;

    int doStuff() {
        return provider.get() * 2;
    }
}

interface NumberProvider {

    int get();
}

@Service
class ProviderA implements NumberProvider {

    @Override
    public int get() {
        return 1;
    }
}

@Primary
@Service
class ProviderB implements NumberProvider {

    @Override
    public int get() {
        return 2;
    }
}
