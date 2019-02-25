package com.goxr3plus.speech.translator.data;

import java.util.ArrayList;

public class WordDefinitions {
  private ArrayList<WordDefinitionsForRole> roleDefinitions = new ArrayList<>();

  public static WordDefinitions parse(ArrayList<Object> rawParsed) {
    final WordDefinitions result = new WordDefinitions();
    for (Object r : rawParsed) {
      //noinspection unchecked
      result.roleDefinitions.add(WordDefinitionsForRole.parse((ArrayList<Object>) r));
    }
    return result;
  }

  public ArrayList<WordDefinitionsForRole> getRoleDefinitions() {
    return roleDefinitions;
  }

  public void setRoleDefinitions(ArrayList<WordDefinitionsForRole> roleDefinitions) {
    this.roleDefinitions = roleDefinitions;
  }
}
