package javasamples.solid.ocp.good;

public class AutoGrader {

    public double grade(Assesment assesment) {
        double totalScore = 0;
        for (Question question : assesment.getQuestions()) {
            totalScore += question.getAwardedPoints();
        }
        return totalScore;
    }
}

