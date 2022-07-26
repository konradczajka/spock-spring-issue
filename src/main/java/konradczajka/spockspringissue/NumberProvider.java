package konradczajka.spockspringissue;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public interface NumberProvider {

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
