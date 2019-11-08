import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestCwk {

        @Test
        public void test1(){
            String[] array = {"30","35"};
            Dec2Hex.main(array);
        }
        @Test
        public void test2(){
            String[] array = {"S"};
            Dec2Hex.main(array);
        }
        @Test
        public void test3(){
            String[] array = {};
            Dec2Hex.main(array);
        }


}
