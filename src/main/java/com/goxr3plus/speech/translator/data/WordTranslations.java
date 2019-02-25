package com.goxr3plus.speech.translator.data;

import java.util.ArrayList;

public class WordTranslations {
  private ArrayList<WordTranslationsForRole> roleTranslations = new ArrayList<>();

  public static WordTranslations parse(ArrayList<Object> rawParsed) {
    final WordTranslations result = new WordTranslations();
    for (Object r : rawParsed) {
      //noinspection unchecked
      result.roleTranslations.add(WordTranslationsForRole.parse((ArrayList<Object>) r));
    }
    return result;
  }

  public ArrayList<WordTranslationsForRole> getRoleTranslations() {
    return roleTranslations;
  }

  public void setRoleTranslations(ArrayList<WordTranslationsForRole> roleTranslations) {
    this.roleTranslations = roleTranslations;
  }
}
