package by.epam.tasks.aggregation.first.runner;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

import by.epam.tasks.aggregation.first.bean.Sentence;
import by.epam.tasks.aggregation.first.bean.Text;
import by.epam.tasks.aggregation.first.bean.Word;
import by.epam.tasks.aggregation.first.logic.TextLogic;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Word> wordArrayList = new ArrayList<>();
        wordArrayList.add(new Word("quote's"));
        wordArrayList.add(new Word("Les"));
        wordArrayList.add(new Word("Brawn"));
        Sentence sentence = new Sentence(wordArrayList);
        ArrayList<Sentence> sentenceArrayList = new ArrayList<>();
        sentenceArrayList.add(sentence);
        sentenceArrayList.add(sentence);
        sentenceArrayList.add(sentence);
        Text text = new Text("Pablo", sentenceArrayList);
        TextLogic textLogic = new TextLogic();
        textLogic.addSentence(text, new Sentence(new ArrayList<>(Collections.singleton(new Word("Pablo")))));
        System.out.println(text.getHeader());
        System.out.println(textLogic.getTextToString(text));
    }
}