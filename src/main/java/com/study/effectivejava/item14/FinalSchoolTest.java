package com.study.effectivejava.item14;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
public class FinalSchoolTest {

    private int mathScore;
    private int englishScore;
    private int koreanScore;

    public static void main(String[] args) {
        FinalSchoolTest test = new FinalSchoolTest();
        List<FinalSchoolTest> testList = new ArrayList<>();
        testList.add(test);
        testList.stream()
                .sorted(Comparator.comparingInt(FinalSchoolTest::getMathScore));

        testList.stream()
                .sorted((a, b) -> a.englishScore - b.englishScore);
    }
}
