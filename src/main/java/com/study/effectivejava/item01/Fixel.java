package com.study.effectivejava.item01;

import lombok.*;

import java.util.HashMap;

//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Fixel {

    private String name;
    private Integer phone;
    private Integer age;

    private Fixel() {
    }

    private Fixel(String name, Integer phone, Integer age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    // d. 인스턴스화 불가로 만들 수 있다.
    public static Fixel of(String name, Integer phone, Integer age) {
        Fixel fixel = new Fixel();
        fixel.name = name;
        fixel.phone = phone;
        fixel.age = age;

        return fixel;
    }

    // 1. 이름을 가질 수 있다. 생성자에 넘기는 매개변수와 생성자 자체만으로는 반환될 객체의 특성을 제대로 설명하지 못한다.
    public static Fixel yujin(Integer phone, Integer age) {
        Fixel fixel = new Fixel();
        fixel.name = "김유진";
        fixel.phone = phone;
        fixel.age = age;

        return fixel;
    }



    // 2. 인스턴스를 새로 생성하지 않아도 된다.
    private static Fixel DEFAULT_FIXEL = new Fixel();
    public static Fixel getInstance() {
        return DEFAULT_FIXEL;
    }

    // 2-a. Flyweight(플라이웨이트) 패턴
    //      인스턴스를 가능한 한 공유해서 사용함으로써 메모리를 절약하는 패턴
    // 예시) PIZZA - default

    @Getter
    @ToString
    public static class Pizza {

        private String name;

        private Materials materials;

        public Pizza() {
        }

        public Pizza(String name, Materials materials) {
            this.name = name;
            this.materials = materials;
        }

        public static class Materials {
            private String topping;
            private String sauce;

            public Materials() {
            }

            public Materials(String topping, String sauce) {
                this.topping = topping;
                this.sauce = sauce;
            }
        }

    }
    public static class MaterialsFactory {
        public static final HashMap<String, Pizza.Materials> pizzaHashMap = new HashMap<>();

        private static final Pizza.Materials DEFAULT_MATERIAL = new Pizza.Materials("pepperoni", "tomato");

        public static Pizza.Materials getMaterials(String name) {
            Pizza.Materials pizza = pizzaHashMap.get(name);

            if (pizza != null && pizzaHashMap.containsKey(name)) {
                System.out.println("피자 인스턴스: " + pizza.hashCode());
                return pizza;
            } else {
                // singleton 패턴과의 차이
                //   싱글톤은 오로지 하나의 클래스에서 하나의 인스턴스만 허용한다.
                Pizza.Materials newPizza = new Pizza.Materials();
                pizzaHashMap.put(name, newPizza);

                System.out.println("세상에 없는 피자 인스턴스: " + newPizza.hashCode());
            }
//            Pizza pizza = pizzaHashMap.getOrDefault(name, Pizza.ofDefault());

            return pizzaHashMap.get(name);
        }
    }

    public static class UM extends Fixel {
        private String uxDesigner;
    }

    // 3. 반환타입의 하위 타입 객체를 반환할 수 있다.
    public static Fixel getFixel(boolean flag) {
        return flag ? new Fixel() : new UM();
    }



    public static void main(String[] args) {
        // flyweight

        // *** 새로운 피자를 생성하면 기본 재료로 등록된다.
        //      1. pizza1 피자는 a재료로 만든다.
        //      2. pizza2 피자는 a재료로 만든다.
        //      3. pizza4 피자는 c재료로 만든다.
        Pizza pizza1 = new Pizza("pizza1", MaterialsFactory.getMaterials("a"));
//        Pizza b = MaterialsFactory.getPizza("b");
        Pizza pizza2 = new Pizza("pizza2", MaterialsFactory.getMaterials("a"));
        Pizza pizza4 = new Pizza("pizza4", MaterialsFactory.getMaterials("c"));

        // 3. 반환타입의 하위 타입 객체를 반환할 수 있다.
//        UM um = (UM) Fixel.getFixel(false);

        System.out.println("pizza1: " + pizza1 + ", pizza2: " + pizza2 + "pizza4: " + pizza4);

        if (pizza1 != pizza2) {
            System.out.println("다름" + pizza1.equals(pizza2));
        }

        if (pizza4 == pizza2) {
            System.out.println("같음" + pizza4.equals(pizza2));
        }
    }


}
