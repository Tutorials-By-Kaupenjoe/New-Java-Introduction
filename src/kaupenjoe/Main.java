package kaupenjoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* COLLECTIONS */

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

        List<String> moreQuestions = new ArrayList<>();
        moreQuestions.add("What website hosts most videos in the world?");
        moreQuestions.clear();

        List<Integer> pointsOnTest = new ArrayList<>();
        pointsOnTest.add(19);
        pointsOnTest.add(55);
        pointsOnTest.add(78);


        Set<String> countriesToVisit = new HashSet<>();
        countriesToVisit.add("France");
        countriesToVisit.add("Germany");
        countriesToVisit.add("Spain");
        countriesToVisit.add("France");

        System.out.println(countriesToVisit);

        Map<String, Integer> countryToPopulationMap = new HashMap<>();
        countryToPopulationMap.put("USA", 331000000);
        countryToPopulationMap.put("United Kingdom", 67330000);
        countryToPopulationMap.put("Austria", 8950000);

        System.out.println(countryToPopulationMap.get("USA"));
        System.out.println(countryToPopulationMap.get("Germany"));

        System.out.println(countryToPopulationMap);


        moreQuestions.add("What website hosts most videos in the world?");
        moreQuestions.add("What is the capital of Germany?");
        for(int i = 0; i < moreQuestions.size(); i++) {
            System.out.println(moreQuestions.get(i));
        }

        for(Map.Entry<String, Integer> entry : countryToPopulationMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " | Value = " + entry.getValue());
        }

    }
}