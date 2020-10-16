public class FizzBuzz{
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
