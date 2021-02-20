package by.epam.tasks.aggregation.first.logic;

import by.epam.tasks.aggregation.first.bean.Sentence;
import by.epam.tasks.aggregation.first.bean.Text;

public class TextLogic {

    public void addSentence(Text text, Sentence sentence){
        text.getSentenceArrayList().add(sentence);
    }

    public String getTextToString(Text text) {
        String str = "";
        SentenceLogic sentenceLogic = new SentenceLogic();
        for (Sentence sentence : text.getSentenceArrayList()) {
            str += sentenceLogic.getSentenceToString(sentence);
        }
        return str;
    }
}
