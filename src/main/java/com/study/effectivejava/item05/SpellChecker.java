package com.study.effectivejava.item05;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return word.equals(dictionary.getHelloWord());
    }


    public static void main(String[] args) {
        Lexicon lexicon = new KoreanDictionary();
        SpellChecker spellChecker = new SpellChecker(lexicon);

        Assert.isTrue(spellChecker.isValid("안녕"), "안녕 땡!");
        Assert.isTrue(spellChecker.isValid("hello"), "hello 땡!");
    }
}

/**
 * 유연하게 Lexicon에 대한 test 코드를 작성할 수 있다.
 */
class TestDictionary implements Lexicon {

    Map<Lexicon, String> dictionaryMap = new HashMap<>();

    @Override
    public String getHelloWord() {
        return dictionaryMap.getOrDefault(new EnglishDictionary(), "hello");
    }
}

