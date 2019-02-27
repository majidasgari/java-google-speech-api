package com.goxr3plus.speech.translator.data;

import java.util.ArrayList;

public class WordTranslation {
  private String translation;
  private Double factor;
  private ArrayList<String> sensesInSourceLanguage = new ArrayList<>();

  public static WordTranslation parse(Object translation, Object synSetInfo) {
    final WordTranslation wst = new WordTranslation();
    wst.translation = String.valueOf(translation);
    if (synSetInfo instanceof ArrayList) {
      @SuppressWarnings("unchecked") final ArrayList<Object> list = (ArrayList<Object>) synSetInfo;
      if (list.size() > 1) //noinspection unchecked
        wst.sensesInSourceLanguage = (ArrayList<String>) list.get(1);
      if (list.size() > 3) wst.factor = (Double) list.get(3);
    }
    return wst;
  }

  public String getTranslation() {
    return translation;
  }

  public void setTranslation(String translation) {
    this.translation = translation;
  }

  public Double getFactor() {
    return factor;
  }

  public void setFactor(Double factor) {
    this.factor = factor;
  }

  public ArrayList<String> getSensesInSourceLanguage() {
    return sensesInSourceLanguage;
  }

  public void setSensesInSourceLanguage(ArrayList<String> sensesInSourceLanguage) {
    this.sensesInSourceLanguage = sensesInSourceLanguage;
  }
}
