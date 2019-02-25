package com.goxr3plus.speech.translator.data;

import java.util.ArrayList;
import java.util.List;

public class WordTranslationsForRole {
  private String posTag;
  private List<WordTranslation> meanings = new ArrayList<>();
  private String word;
  private Double factor;

  public static WordTranslationsForRole parse(ArrayList<Object> r) {
    final WordTranslationsForRole result = new WordTranslationsForRole();
    if (r.size() > 0) {
      result.posTag = String.valueOf(r.get(0));
    }
    if (r.size() > 2) {
      @SuppressWarnings("unchecked") final List<Object> wordSenses = (List<Object>) r.get(1);
      @SuppressWarnings("unchecked") final List<Object> wordSenseTranslations = (List<Object>) r.get(2);
      if (wordSenses.size() == wordSenseTranslations.size())
        for (int i = 0; i < wordSenses.size(); i++) {
          result.meanings.add(WordTranslation.parse(wordSenses.get(i), wordSenseTranslations.get(i)));
        }
    }
    if (r.size() > 3) result.word = String.valueOf(r.get(3));
    if (r.size() > 4) result.factor = (Double) (r.get(4));
    return result;
  }

  public String getPosTag() {
    return posTag;
  }

  public void setPosTag(String posTag) {
    this.posTag = posTag;
  }

  public List<WordTranslation> getMeanings() {
    return meanings;
  }

  public void setMeanings(List<WordTranslation> meanings) {
    this.meanings = meanings;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public double getFactor() {
    return factor;
  }

  public void setFactor(double factor) {
    this.factor = factor;
  }
}
