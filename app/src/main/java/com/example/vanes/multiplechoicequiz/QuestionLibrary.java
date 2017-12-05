package com.example.vanes.multiplechoicequiz;

/**
 * Created by vanes on 4/12/2017.
 */

public class QuestionLibrary {

    private String mQuestions [] = {
           "Which part of the plant holds it in the soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and hummingbirds",
            "The ________ holds the plant upright.",
            "Brass gets discoloured in air because of the presence of which of the following gases in air?",
            "Which of the following is a non metal that remains liquid at room temperature?",
            "Chlorophyll is a naturally occurring chelate compound in which central metal is",
            "Which of the following is used in pencils?",
            "Which of the following metals forms an amalgam with other metals?",
            "The gas usually filled in the electric bulb is"
    };
    private String mChoices[][]={
            {"Roots","Stem","Flower"},
            {"Fruit","Leaves","Seeds"},
            {"Bark","Flower","Roots"},
            {"Flower","Leaves","Stem"},
            {"Oxygen","Hydrogen","Carbon dioxide","Nitrogen"},
            {"Phosphorous","Bromine","Chlorine","Helium"},
            {"copper","magnesium","iron","calcium"},
            {"Graphite","Silicon","Charcoal","Phosphorous"},
            {"Tin","Mercury","Lead","Zinc"},
            {"nitrogen","hydrogen","carbon dioxide","oxygen"}
    };

    private String mCorrectAnswers[]={"Roots","Leaves","Flower","Stem","Hydrogen","Bromine","magnesium","Graphite","Mercury","nitrogen"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1 (int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2 (int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3 (int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
