package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* METHODS */

        // Going Beyond the main method!

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

        outputQuestionsAndAnswersXTimes(5, questions, answers);
        System.out.println("----");
        outputQuestionsAndAnswersXTimes(2, questions, answers);
        System.out.println("----");
        outputQuestionsAndAnswersXTimes(3, questions, answers);
        System.out.println("----");
        outputQuestionsAndAnswersXTimes(8, questions, answers);


    }

    private static void outputQuestionsAndAnswersXTimes(int x, String[] questions, String[] answers) {
        for (int c = 0; c < x; c++) {
            outputQuestionsAndAnswers(questions, answers);
        }
    }

    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
        for(int i = 0; i < questions.length; i++) {
            System.out.println("Q: " + questions[i] + " | A: " + answers[i]);
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}