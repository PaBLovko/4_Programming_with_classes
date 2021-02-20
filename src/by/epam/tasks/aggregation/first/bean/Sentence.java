package by.epam.tasks.aggregation.first.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Sentence {
    private ArrayList<Word> wordArrayList;

    public Sentence(ArrayList<Word> wordArrayList) {
        wordArrayList.add(new Word("."));
        this.wordArrayList = wordArrayList;
    }

    public ArrayList<Word> getWordList() {
        return wordArrayList;
    }

    public void setWordList(ArrayList<Word> wordArrayList) { this.wordArrayList = wordArrayList;}

    @Override
    public int hashCode() {
        return Objects.hash(wordArrayList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(wordArrayList, sentence.wordArrayList);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "wordArrayList=" + wordArrayList +
                '}';
    }
}
