package by.epam.tasks.aggregation.first.logic;

import by.epam.tasks.aggregation.first.bean.Sentence;
import by.epam.tasks.aggregation.first.bean.Word;

public class SentenceLogic {

    public String getSentenceToString(Sentence sentence) {
        String str = "";
        for (Word word : sentence.getWordList()) {
            str +=  word.getWord() + " ";
        }
        return str;
    }
}
