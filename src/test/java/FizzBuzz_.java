import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {

    @Test
    public void sholud_return_num_when_not_3_or_5_multiple(){
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
        assertThat(FizzBuzz.of(32)).isEqualTo("32");
        assertThat(FizzBuzz.of(13)).isEqualTo("13");
    }
    @Test
    public void sholud_return_Fizz_when_multiple_3(){
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(24)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
    }
    @Test
    public void sholud_return_Buzz_when_multiple_5(){
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(10)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(20)).isEqualTo("Buzz");
    }
    @Test
    public void sholud_return_Buzz_when_multiple_5_and_3(){
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(30)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(45)).isEqualTo("FizzBuzz");
    }



    public static class FizzBuzz{
        public static String of(int i){
            String a = "";
            if (i%3==0 || i%5 == 0){a = Fizzy(i);}
            else{a = String.valueOf(i);}
            return a;
        }

        private static String Fizzy(int i){
            String a = "";
            if (i%3 == 0){a = a + "Fizz";}
            return Buzzy(i, a);
        }
        private static String Buzzy (int i, String a){
            if (i%5 == 0){a = a + "Buzz";}
            return a;
        }




    }




}
