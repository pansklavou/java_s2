package Assesment01;





public class Question {
    protected String category;
    protected String question;
    protected String [] answers;
    protected int correctIndex;

    public void setAnswers(String correct, String [] wrong) {
        // do nothing
    }

    public void display() { // displays the question to the user
        System.out.println("Question: " + question);
        int counter = 1;
        for(String answer : answers) {
            System.out.println(counter + ". " + answer);
            counter++;
        }
        System.out.println(correctIndex);
    }

    public boolean isCorrectAnswer(int ans) {
        return (ans-1) == correctIndex;
    }
}

