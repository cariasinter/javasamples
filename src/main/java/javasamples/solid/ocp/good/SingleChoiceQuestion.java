package javasamples.solid.ocp.good;

public class SingleChoiceQuestion implements Question {
    private int itemValue;
    private int selectedOption;
    private int correctOption;

    public SingleChoiceQuestion(int itemValue, int selectedOption, int correctOption) {
        this.itemValue = itemValue;
        this.selectedOption = selectedOption;
        this.correctOption = correctOption;
    }

    @Override
    public int getItemValue() {
        return itemValue;
    }

    @Override
    public int getAwardedPoints() {
        return selectedOption == correctOption ? itemValue : 0;
    }
}
