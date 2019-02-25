package com.goxr3plus.speech.translator.data;

import java.util.ArrayList;
import java.util.List;

public class WordDefinitionsForRole {
  private String posTag;
  private List<WordDefinition> definitions = new ArrayList<>();
  private String word;

  public static WordDefinitionsForRole parse(ArrayList<Object> r) {
    final WordDefinitionsForRole result = new WordDefinitionsForRole();
    if (r.size() > 0) result.posTag = String.valueOf(r.get(0));
    if (r.size() > 1) {
      @SuppressWarnings("unchecked") final List<Object> definitions = (List<Object>) r.get(1);
      for (Object definition : definitions) {
        //noinspection unchecked
        result.definitions.add(WordDefinition.parse((ArrayList<Object>) definition));
      }
    }
    if (r.size() > 2)
      result.word = String.valueOf(r.get(2));
    return result;
  }

  public String getPosTag() {
    return posTag;
  }

  public void setPosTag(String posTag) {
    this.posTag = posTag;
  }

  public List<WordDefinition> getDefinitions() {
    return definitions;
  }

  public void setDefinitions(List<WordDefinition> definitions) {
    this.definitions = definitions;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }
}
