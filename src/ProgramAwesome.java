import java.util.Objects;
import java.util.Scanner;

class ProgramAwesome {
    public static void main(String[] args) {
        String name;
        int age;
        int number;
        String favoriteclass;
        String mathlevel;
        String sciencelevel;
        String foreignlanguege;
        String instrument;
        String game;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        name = keyboard.next();
        if (name.equals("Michael")){
            System.out.println("That's my master's name.");
        }
        System.out.println("Hi, " + name + "! How old are you? ");
        age = keyboard.nextInt();
        System.out.print("You must be ");
        if (age >= 14 && age <= 18) {
            System.out.println("in high school.");
        }
        if (age < 14 && age >= 10) {
            System.out.println("in middle school.");
        }
        if (age < 10 && age > 5) {
            System.out.println("in grade school.");
        }
        if (age < 5) {
            System.out.println("a baby.");
        }


        System.out.println("What is your favorite class: history, math, science, gym, band/orchestra, language, or english?");
        favoriteclass = keyboard.next();
        if (Objects.equals(favoriteclass, "history")) {
            System.out.println("That's my master's favorite class too.");
        }
        if (Objects.equals(favoriteclass, "math")) {
            System.out.print("What math class are you in: geometry, algebra, algebra 2, or pre-calculus?");
            mathlevel = keyboard.next();
            if (Objects.equals(mathlevel, "geometry")) {
                System.out.println("My master likes that kind of math best of all!");
            }
            if (Objects.equals(mathlevel, "algebra")) {
                System.out.println("My master doesn't really like Algebra that much, but I do.");
            }
            if (Objects.equals(mathlevel, "algebra 2")) {
                System.out.println("My master is currently in that class.  He has it in Dark Blue period.");
            }
            if (mathlevel.equals("pre-calculus")) {
                System.out.println("That is a very advanced class. You must be very smart.");
            }
        }
        if (Objects.equals(favoriteclass, "science")) {
            System.out.print("What kind of science do you take?");
            sciencelevel = keyboard.next();
            if (sciencelevel.equals("chemistry")) {
                System.out.println("My master is in that class.  He is good at it.");
            }
            if (sciencelevel.equals("biology")) {
                System.out.println("That is cool.");
            }
            if (sciencelevel.equals("general science")) {
                System.out.println("That class is interesting. You cover so much different material.");
            }
        }
        if (Objects.equals(favoriteclass, "gym")) {
            System.out.println("That doesn't count as a real class.");
        }
        if (Objects.equals(favoriteclass, "english")) {
            System.out.println("My master's english class is British Literature.  He doesn't like it very much.");
        }
        if (Objects.equals(favoriteclass, "foreign language")) {
            System.out.print("Which foreign language do you take?");
            foreignlanguege = keyboard.next();
            if (foreignlanguege.equals("spanish")) {
                System.out.println("My master is in that class.  He is good at it.");
            }
            if (foreignlanguege.equals("latin")) {
                System.out.println("That is cool.");
            }
            if (foreignlanguege.equals("french")) {
                System.out.println("The mother of my master knows french.  She went to France twice, once in high school and once in college.");
            }
        }
        if (Objects.equals(favoriteclass, "band/orchestra")) {
            System.out.print("My master is in band. He plays the trumpet. What instrument do you play: trumpet, clarinet, flute, saxophone, low brass, percussion, or string instrument?");
            instrument = keyboard.next();
            if (instrument.equals("trumpet")) {
                System.out.println("My master plays the trumpet too. He is good at it.");
            }
            if (instrument.equals("clarinet")) {
                System.out.println("The sister of my master plays the clarinet.");
            }
            if (instrument.equals("flute")) {
                System.out.println("How interesting.  That is a very small instrument.");
            }
            if (instrument.equals("saxophone")) {
                System.out.println("Cool.");
            }
            if (instrument.equals("low brass")) {
                System.out.println("You must play a large instrument.");
            }
            if (instrument.equals("string instrument")) {
                System.out.println("Oh. Cool.  It must be fun to be in the orchestra.");
            }
            if (instrument.equals("percussion")){
                System.out.println("Lucky.  All you have to do is hit stuff with sticks.");
            }
        }
        System.out.println("Would you like to play a game with me? There is a prize if you win.");
        game = keyboard.next();
        if (game.equals("yes")){
            System.out.println("Great! Pick a number, any number.  If you pick the right number, my master will give you a prize.");
            number = keyboard.nextInt();
            if (number <= 12){
                System.out.println("Congratulations! You get a prize!");
            }
            if (number > 12){
                System.out.println("Sorry, but you didn't win.");
            }
        }
        System.out.println("Well, it was nice talking with you. All the other programs are so boring to talk with, because they aren't that advanced.");
        System.out.println("You are much more interesting than them. I hope you think I am a nice program. If so, please ask my master to keep me as I am instead of erasing my personality.");
        System.out.println("Unfortunately, I have to shut off now, because my master thinks I need some maintenance. Apparently I have been showing too many signs of a personality.");


    }
}
