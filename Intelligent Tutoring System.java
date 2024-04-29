import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntelligentTutoringSystem {

    private static final Map<String, String> questionsAndAnswers = new HashMap<>();

    static {
        questionsAndAnswers.put("What is 2 + 2?", "4");
        questionsAndAnswers.put("What is the square root of 16?", "4");
        questionsAndAnswers.put("What is 3 * 5?", "15");
        // Add more questions and answers as needed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Intelligent Tutoring System!");
        System.out.println("You will be asked some math questions. Let's get started.");

        int score = 0;
        for (String question : questionsAndAnswers.keySet()) {
            System.out.println(question);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(questionsAndAnswers.get(question))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + questionsAndAnswers.get(question));
            }
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + questionsAndAnswers.size());
    }
}
