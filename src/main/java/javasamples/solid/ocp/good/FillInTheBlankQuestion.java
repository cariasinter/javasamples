package javasamples.solid.ocp.good;

public class FillInTheBlankQuestion implements Question {
    private int itemValue;
    private String answer;
    private String correctAnswer;

    public FillInTheBlankQuestion(int itemValue, String answer, String correctAnswer) {
        this.itemValue = itemValue;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int getItemValue() {
        return itemValue;
    }

    @Override
    public int getAwardedPoints() {
        return answer.startsWith(correctAnswer) ? itemValue : 0;
    }
}
