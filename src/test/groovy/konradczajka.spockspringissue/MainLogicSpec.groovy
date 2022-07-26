package konradczajka.spockspringissue

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class MainLogicSpec extends Specification {

    @Autowired
    MainLogic mainLogic;

    @SpringBean
    NumberProvider numberProvider = Stub()

    def multipliesProviderNumberByTwo() {
        given:
            numberProvider.get() >> 4
        expect:
            mainLogic.doStuff() == 8
    }
}