package com.goxr3plus.speech.translator.data;

import java.util.ArrayList;

public class WordDefinition {
  private String definition;
  private String reference;
  private String example;

  public static WordDefinition parse(ArrayList<Object> o) {
    WordDefinition result = new WordDefinition();
    if (o.size() > 0) result.definition = String.valueOf(o.get(0));
    if (o.size() > 1) result.reference = String.valueOf(o.get(1));
    if (o.size() > 2) result.example = String.valueOf(o.get(2));
    return result;
  }

  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }
}
