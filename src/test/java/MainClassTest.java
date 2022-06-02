import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {

    @Test
    public void test(){
        int res=MainClass.add(4,5);
        Assertions.assertEquals(9,res);
    }
}
