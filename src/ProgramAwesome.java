import java.util.Objects;
import java.util.Scanner;

public class ProgramAwesome {
        public static void main(String[] args) {
            String name;
            int age;

            Scanner keyboard = new Scanner(System.in);
            System.out.print("What is your name?");
                name = keyboard.next();
                    if (Objects.equals(name, "Sam")) {
                    System.out.println("You must have meant BeanBag Bug");
                    }
            System.out.print( "Hi, " + name + "! How old are you? " );
                age = keyboard.nextInt();
            System.out.print( "You must be " );
                     if ( age >= 14 && age <= 18) {
                         System.out.print( "in high school." );
                         }
                     if ( age <14 && age >= 10) {
                         System.out.print( "in middle school." );
                         }
                     if ( age < 10 && age > 5) {
                         System.out.print( "in grade school." );
                         }
                     if ( age < 5 ) {
                         System.out.print( "a baby." );
                         }



        }


}

