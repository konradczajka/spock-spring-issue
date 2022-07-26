package konradczajka.spockspringissue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MainLogicTest {

    @Autowired
    MainLogic mainLogic;

    @MockBean
    NumberProvider numberProvider;

    @Test
    void multipliesProviderNumberByTwo() {
        when(numberProvider.get()).thenReturn(4);

        assertThat(mainLogic.doubleIt()).isEqualTo(8);
    }
}
