package javasamples.solid.ocp.wrong;

public class AutoGrader {

    public double grade(Assesment assesment) {
        double totalScore = 0;
        for (Question question : assesment.getQuestions()) {
            if (question instanceof SingleChoiceQuestion) {
                SingleChoiceQuestion scq = (SingleChoiceQuestion) question;
                if (scq.getSelectedOption() == scq.getCorrectOption()) {
                    totalScore += scq.getItemValue();
                }
            } else if (question instanceof FillInTheBlankQuestion) {
                FillInTheBlankQuestion fibq = (FillInTheBlankQuestion) question;
                if (fibq.getAnswer().equalsIgnoreCase(fibq.getCorrectAnswer())) {
                    totalScore += fibq.getItemValue();
                }
            }
        }
        return totalScore;
    }
}
