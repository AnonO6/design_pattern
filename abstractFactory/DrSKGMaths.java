package abstractFactory;
import java.util.*; 
// Concrete Product for Hard Maths Section
class DrSKGMaths implements MathsSection {
    private static final List<String> questions = new ArrayList<>();

    static {
        questions.add("Question 1 by Dr. SKG");
        questions.add("Question 2 by Dr. SKG");
        questions.add("Question 3 by Dr. SKG");
        questions.add("Question 4 by Dr. SKG");
        questions.add("Question 5 by Dr. SKG");
    }

    @Override
    public void display() {
        System.out.println("Maths Section");
        displayRandomQuestions(questions);
    }

    private void displayRandomQuestions(List<String> questions) {
        Collections.shuffle(questions);
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + ". " + questions.get(i));
        }
    }
}
