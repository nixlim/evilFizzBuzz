public class NumberBuzzHandler {
    public String divisibleByFive(int number) {
        if(number % 5 == 0 ){
            return "buzz";
        }
        return "" + number;
    }
}
