package com.goxr3plus.speech.translator.data;

public class SingleWordData {
  private WordDefinitions definitions;
  private WordTranslations translations;

  public WordDefinitions getDefinitions() {
    return definitions;
  }

  public void setDefinitions(WordDefinitions definitions) {
    this.definitions = definitions;
  }

  public WordTranslations getTranslations() {
    return translations;
  }

  public void setTranslations(WordTranslations translations) {
    this.translations = translations;
  }
}
