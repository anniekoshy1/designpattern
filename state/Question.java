/**
 * Annie Koshy
 * CSCE 247
 * Question
 * Question class to generate arithmetic questions
 */
public class Question{
    private String question;
    private int answer;

    public Question(int num1, int num2, Operation operation){
        switch (operation){
            case PLUS:
                this.answer = num1 + num2;
                this.question = num1 + " + " + num2;
                break;
            case MINUS:
                this.answer = num1 - num2;
                this.question = num1 + " - " + num2;
                break;
            case MULTIPLY:
                this.answer = num1 * num2;
                this.question = num1 + " * " + num2;
                break;
            case DIVIDE:
                this.answer = num1 / num2;
                this.question = num1 + " / " + num2;
                break;
        }
    }

    @Override
    public String toString(){
        return question;
    }

    public int getAnswer(){
        return answer;
    }
// checks if the user's answer is correct
    public boolean isCorrect(int userAnswer){
        return this.answer == userAnswer;
    }
}