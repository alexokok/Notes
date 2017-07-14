package com.example.admin1337.notes.model;

/**
 * @author Alexey Mazaev
 */

public class Note {

  private String title;
  private NoteType type;
  private String body;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NoteType getType() {
    return type;
  }

  public void setType(NoteType type) {
    this.type = type;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Note(String title, NoteType type, String body) {
    this.title = title; this.type = type; this.body = body;
  }
}
