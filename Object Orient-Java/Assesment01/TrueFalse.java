package Assesment01;




public class TrueFalse extends Question { //retrieving true/false questions

    @Override
    public void setAnswers(String correct, String[] wrong) {
        String [] answers = {"True", "False"};
        if(correct.equals("True")) {
            correctIndex = 0;
        }
        else {
            correctIndex = 1;
        }
        this.answers = answers;
    }
}

