import java.io.Console;

public class Hotel{
    public static void main(String[] args) {
        Console myConsole =System.console();
        System.out.println("What season will you be booking the hotel?");
        String season = myConsole.readLine();
        System.out.println("On the weekend or during the week?");
        String day =myConsole.readLine();

        boolean seasons= season.equals("summer");
        boolean days= day.equals("weekend");
        if(seasons && days){
            System.out.println("Your hotel stay will be expensive because it is peak season and weekend");
        }
        else if(seasons){
            System.out.println("during summer the hotels are quite expensive, get ready");
        }
        else if(days){
            System.out.println("weekends are quite busy, the price might be expensive");
        }
        else{
            System.out.println("your stay might not be as expensive as you think :-]");
        }
        
        
    }
}