package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* ARRAYS */

        String question1 = "What does WWW stand for?";
        String question2 = "What is the World's largest Ocean?";
        String question3 = "Which Year did East and West Germany Unify?";
        String question4 = "What is the capital of France?";

        String answer1 = "World Wide Web";
        String answer2 = "Pacific Ocean";
        String answer3 = "1990";
        String answer4 = "Paris";

        // Now add 15 more...
        // Let's loop through them

        for(int i = 0; i < 4; i++) {
            // System.out.println(questioni); DOES NOT WORK!
        }

        // Array - Think of this as a list
        String[] questions = new String[4];
        questions[0] = "What does WWW stand for?";
        questions[1] = "What is the World's largest Ocean?";
        questions[2] = "Which Year did East and West Germany Unify?";
        questions[3] = "What is the capital of France?";

        String[] answers = new String[4];
        answers[0] = "World Wide Web";
        answers[1] = "Pacific Ocean";
        answers[2] = "1990";
        answers[3] = "Paris";

        System.out.println("Q: " + questions[0] + " | A: " + answers[0]);

        for(int i = 0; i < questions.length; i++) {
            System.out.println("Q: " + questions[i] + " | A: " + answers[i]);
        }

        for(String question : questions) {
            System.out.println(question);
        }
    }
}