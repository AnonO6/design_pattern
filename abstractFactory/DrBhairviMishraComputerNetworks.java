package abstractFactory;
import java.util.*; 
// Concrete Product for Hard Computer Networks Section
class DrBhairviMishraComputerNetworks implements ComputerNetworksSection {
    private static final List<String> questions = new ArrayList<>();

    static {
        questions.add("Question 1 by Dr. Bhairvi Mishra");
        questions.add("Question 2 by Dr. Bhairvi Mishra");
        questions.add("Question 3 by Dr. Bhairvi Mishra");
        questions.add("Question 4 by Dr. Bhairvi Mishra");
        questions.add("Question 5 by Dr. Bhairvi Mishra");
    }

    @Override
    public void display() {
        System.out.println("Computer Networks Sectio *OPEN BOOK*");
        displayRandomQuestions(questions);
    }

    private void displayRandomQuestions(List<String> questions) {
        Collections.shuffle(questions);
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + ". " + questions.get(i));
        }
    }
}
