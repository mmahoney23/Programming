import java.util.Scanner;

public class Question {
    public String question;
    public int input;
    public String[] possibilities;
    public Question(String question, String[] possibilities){
        this.question = question;
        this.possibilities = possibilities;
    }
    public String[] getPossibilities() {
        return possibilities;
    }
    public String getInput() {
        return this.possibilities[input];
    }
    public void askQuestion() {
        for (int i = 0; i < this.question.length(); i++) {
            System.out.println(this.possibilities[i]);
        }
        System.out.println("What is your favorite? (0 indexed)");
        this.input = new Scanner(System.in).nextInt();
    }
}
