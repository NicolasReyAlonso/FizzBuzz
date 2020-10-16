import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {

    @Test

    public void sholud_return_num_when_not_3_or_15_multiple(){

    }


    public static class FizzBuzz{
        public String of(int i){
            String a = "";
            a = classify(i);
            return a;
        }

        private static String classify(int i){
            if (i>14){return Buzzy(i);}
            return Fizzy(i);
        }
        private static String Buzzy (int i){
            if (i%15 == 0){return  "FizzBuzz";}
            return Fizzy(i);
        }
        private static String Fizzy (int i){
            if(i%3 == 0){return "Fizz";}
            return String.valueOf(i);
        }


    }




}
