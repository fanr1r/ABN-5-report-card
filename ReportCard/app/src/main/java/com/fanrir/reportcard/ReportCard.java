package com.fanrir.reportcard;

import java.util.ArrayList;

/**
 * Created by Eisdrachl on 03.07.2016.
 */
public class ReportCard {

    public enum Marks {
        A("A"), B("B"), C("C"), D("D"), F("F");

        private final String markDescription;

        private Marks(String value) {
            markDescription = value;
        }

        public String getMarksDescription() {
            return markDescription;
        }
    }

    private ArrayList<Marks> grades;

    public ReportCard() {
        grades = new ArrayList<>();
    }

    public ReportCard(ArrayList<Marks> marks) {
        this.grades = marks;
    }

    public ArrayList<Marks> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Marks> grades) {
        this.grades = grades;
    }

    public void addGrade(Marks mark) {
        grades.add(mark);
    }

    @Override
    public String toString() {
        String reportCard = "ReportCard:";

        for (int i = 0; i < grades.size(); i++) {
            reportCard += "\n" + grades.get(i);
        }

        return reportCard;
    }
}
