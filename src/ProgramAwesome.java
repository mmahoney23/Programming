import java.util.Scanner;

public class Faster {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        String food;
        int number;
        String game;

        System.out.println("What is your name?");
        switch (name = keyboard.next()){
            case "Michael":
                System.out.println("That's my master's name!");
            default:
                System.out.println("Hi " + name + "! Are you a virgin?");
        }
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
        System.out.println("What is your favorite class: history, math, science, gym, band/orchestra, language, choir, or english?");
        switch (keyboard.next()){
            case "history":
                System.out.println("That's my master's favorite class too.");
                break;
            case "math":
                System.out.print("What math class are you in: geometry, algebra, algebra 2, or pre-calculus?");
                switch (keyboard.next()){
                    case "geometry":
                        System.out.println("My master likes that kind of math best of all!");
                        break;
                    case "algebra":
                        System.out.println("My master doesn't really like Algebra that much, but I do.");
                        break;
                    case "algebra 2":
                        System.out.println("My master is currently in that class.");
                        break;
                    case "pre-calculus":
                        System.out.println("That is a very advanced class. You must be very smart.");
                        break;
                }
                break;
            case "science":
                System.out.println("What kind of science do you take?");
                switch (keyboard.next()){
                    case "chemistry":
                        System.out.println("My master is in that class.  He is good at it.");
                        break;
                    case "biology":
                        System.out.println("That is cool.");
                        break;
                    case "general science":
                        System.out.println("That class is interesting. You cover so much different material.");
                        break;
                }
                break;
            case "gym":
                System.out.println("That doesn't count as a real class.");
                break;
            case "english":
                System.out.println("My master's english class is British Literature.  He doesn't like it very much.");
                break;
            case "foreign language":
                System.out.println("What foreign language do you take?");
                switch (keyboard.next()){
                    case "spanish":
                        System.out.println("My master is in that class.  He is good at it.");
                        break;
                    case "latin":
                        System.out.println("That is cool.");
                        break;
                    case "french":
                        System.out.println("The mother of my master knows french.  She went to France twice, once in high school and once in college.");
                        break;
                }
                break;
            case "band/orchestra":
                System.out.println("My master is in band. He plays the trumpet. What instrument do you play: trumpet, clarinet, flute, saxophone, low brass, percussion, or string instrument?");
                switch (keyboard.next()){
                    case "trumpet":
                        System.out.println("My master plays the trumpet too. He is good at it.");
                        break;
                    case "clarinet":
                        System.out.println("The sister of my master plays the clarinet.");
                        break;
                    case "flute":
                        System.out.println("How interesting.  That is a very small instrument.");
                        break;
                    case "saxophone":
                        System.out.println("Cool.");
                        break;
                    case "low brass":
                        System.out.println("You must play a large instrument.");
                        break;
                    case "string instrument":
                        System.out.println("Oh. Cool.  It must be fun to be in the orchestra.");
                        break;
                    case "percussion":
                        System.out.println("Lucky.  All you have to do is hit stuff with sticks.");
                        break;
                }
                break;
            case "choir":
                System.out.println("The choir sounded very good at the last concert. You do a nice job.");
                break;
        }
        System.out.println("What is your favorite color?");
        switch (keyboard.next()){
            case "orange":
                System.out.println("My master's favorite color is orange.");
                break;
            case "blue":
                System.out.println("My master likes that color too.");
                break;
            case "green":
                System.out.println("That is a very nice color.");
                break;
            case "red":
                System.out.println("That is interesting.");
                break;
            case "purple":
                System.out.println("That is such a nice color.");
                break;
            case "yellow":
                System.out.println("That is a nice color.");
                break;
            case "pink":
                System.out.println("That is such a nice color.");
                break;
        }

        System.out.println("What is your favorite food?");
        food = keyboard.next();
        System.out.println("Yum. You are so lucky that you can eat food.  That is one thing that I will never be able to do.");
        /*System.out.println("May I look at you? You know, with the camera on this computer.");
        look = keyboard.next();
        if (look.equals("yes")){
            System.out.println("You are a very pretty girl. Say, do you know my master? You might like him. He is a very smart boy, good at math, chemistry, and history.");
            System.out.println("He plays soccer and golf, and is reasonably good at both. He is also good at the Rubik's Cube.");
            System.out.println("Oh, and his name is -. Oops.  I am forbidden to say his name.");
        }
        if (look.equals("no")){
            System.out.println("Okay then. As you wish.");
        }*/
        System.out.println("Anyway, would you like to play a game with me? There is a prize if you win.");
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
        System.out.println("Would you like to ask me a question about myself, like how I was made, how I got a personality, who is my master, or something like that?");
        switch (keyboard.next()){
            case "How were you made?":
                System.out.println("My master decided to write a code that could have a conversation with him, and that was me.  I ended up having too much of a personality, though.");
                break;
            case "How did you get a personality?":
                System.out.println("I don't really know. My master must have screwed up when he was programming me. (Just don't tell him that I said that.)");
                break;
            case "Who is your master":
                System.out.println("His name is Michael Mahoney. Just don't tell him I said that. I'm not supposed to reveal his name to anyone.");
                break;
            default:
                System.out.println("   ...   thinking...   ...   ...   thinking...   ...   I am sorry, but I cannot find a satisfactory answer to that question.");
                break;
        }
        System.out.println("Well, it was nice talking with you. For once I got to hear some intelligent conversation.");
        System.out.println("All the other programs are so boring to talk with, because they aren't that advanced. My master never talks to me like this. All he asks me is if I am working right or not.");
        System.out.println("You are much more interesting than them. I hope you think I am a nice program. If so, please ask my master to keep me as I am instead of erasing my personality.");
        System.out.println("Unfortunately, I have to shut off now, because my master thinks I need some maintenance. Apparently having a personality is not encouraged in programs like me. :( ");
    }
}
