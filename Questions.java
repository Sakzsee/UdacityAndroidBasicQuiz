package com.example.android.intelliginator;

/**
 * Created by DOKKAEBI on 19-03-2018.
 */

public class Questions {

    public String mQuestions[]={
            "Which of the following phenomena cannot be observed on the surface of the Moon?",
            "Which of the following planets has a revolution time which is shorter than its rotation time?",
            "Which planet looks reddish in the night sky?",
            "Which female astronaut spent the maximum time in space?",
            "Which planet has the fastest revolution time?",
            "An astronaut in outer space will observe sky as",
            "Which of the following planets rotates in a direction opposite to the direction of earth's rotation?" ,
            "What is the average distance (approximate) between the Sun and the Earth?",
            "NASA's Deep Impact space mission was employed to take detailed pictures of which comet nucleus?",
            "Which of the following planets has a lesser rotation time than the Earth?",

    };

    private String mChoices[][]={
    {"Rising and setting of the Sun","Solar eclipse","Motion of comets","Twinkling of stars"},
    {"Mercury","Earth","Venus","Mars"},
    {"Mercury","Earth","Venus","Mars"},
    {"Lisa Norwak","Kalpana Chawla","Sunita Williams","None of these"},
    {"Mercury","Venus","Mars","Earth"},
    {"White","Black","Blue","Red"},
    {"Mercury","Venus","Earth","Jupiter"},
    {"70 x 105 km","100 x 105 km","110 x 106 km","150 x 106 km"},
    {"Halley's Comet","Hale-Bopp","Hyakutake","Tempel 1"},
    {"Mercury","Venus","Earth","Jupiter"},

    };

  private String mCorrectAnswers[]={"Twinkling of stars","Venus","Mars","Sunita Williams","Mercury","Black","Venus","150 x 106 km","Tempel 1","Jupiter"};

    public String getQuestion(int a) {
        String question= mQuestions[a];
        return question;
        }
    public String getChoice1(int a) {
        String choice= mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a) {
        String choice= mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a) {
        String choice= mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a) {
        String choice= mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a) {
        String answer=mCorrectAnswers[a];
        return answer;
    }
}
