
package com.study.effectivejava.item02;

import lombok.Singular;

import java.util.List;


//@Builder
public class NutritionFacts {

//    @Builder.Default
    private int servingSize = 10;
    private int sodium;
    private int carbohydrate;
    private int servings;
    private int calories;
    private int fat;
    @Singular
    private List<String> names;

    public static class Builder {
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }
        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }
        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
        fat = builder.fat;
        calories = builder.calories;
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new Builder(1, 10)
                .fat(10)
                .sodium(4)
                .calories(488)
                .carbohydrate(100)
                .build();

        System.out.println(nutritionFacts);
    }
}
