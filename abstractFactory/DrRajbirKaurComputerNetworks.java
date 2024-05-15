package abstractFactory;
import java.util.*; 
// Concrete Product for Easy Computer Networks Section
class DrRajbirKaurComputerNetworks implements ComputerNetworksSection {
    private static final List<String> questions = new ArrayList<>();

    static {
        questions.add("Question 1 by Dr. Rajbir Kaur");
        questions.add("Question 2 by Dr. Rajbir Kaur");
        questions.add("Question 3 by Dr. Rajbir Kaur");
        questions.add("Question 4 by Dr. Rajbir Kaur");
        questions.add("Question 5 by Dr. Rajbir Kaur");
    }

    @Override
    public void display() {
        System.out.println("Computer Networks Section");
        displayRandomQuestions(questions);
    }

    private void displayRandomQuestions(List<String> questions) {
        Collections.shuffle(questions);
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + ". " + questions.get(i));
        }
    }
}
