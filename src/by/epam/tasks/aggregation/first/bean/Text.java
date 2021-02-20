package by.epam.tasks.aggregation.first.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Text {
    private String header;
    private ArrayList<Sentence> sentenceArrayList;

    public Text(String header, ArrayList<Sentence> sentenceArrayList) {
        this.header = header;
        this.sentenceArrayList = sentenceArrayList;
    }

    public String getHeader() {
        return header;
    }

    public ArrayList<Sentence> getSentenceArrayList() {
        return sentenceArrayList;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setSentenceArrayList(ArrayList<Sentence> sentenceArrayList) {
        this.sentenceArrayList = sentenceArrayList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, sentenceArrayList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(header, text.header) &&
                Objects.equals(sentenceArrayList, text.sentenceArrayList);
    }

    @Override
    public String toString() {
        return "Text{" +
                "heading =" + header +
                ", sentenceList =" + sentenceArrayList +
                '}';
    }
}
