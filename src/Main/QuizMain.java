package Main;

public class QuizMain {
    public static void main(String[] args) {

        QuizGame quizGame = new QuizGame();
        quizGame.startQuiz();
        quizGame.evaluate(quizGame.askQuestions());

    }
}
