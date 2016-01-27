import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[]{0, 1, 2, 3};
        Question[] questions;
        ArrayList<Question> questions1 = new ArrayList<Question>();


        questions1.add(new Question("What is your favorite kind of cupcake?", new String[]{"Strawberry", "Chocolate", "Vanilla", "Red Velvet", "Lemon", "Banana"}));
        //main loop
        for (Question question : questions1) {
            question.askQuestion();
        }
        for (Question question : questions1) {
            System.out.println(question.getInput());
        }
    }
}
