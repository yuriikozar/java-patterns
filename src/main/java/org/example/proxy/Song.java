package org.example.proxy;


public class Song {
  private String id;
  private byte[] content;

  public Song(String id, byte[] content) {
    this.id = id;
    this.content = content;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Song{");
    sb.append("id='").append(id).append('\'');
    sb.append(", content=");
    if (content == null) {
      sb.append("null");
    } else {
      sb.append('[');
      for (int i = 0; i < content.length; ++i) {
        sb.append(i == 0 ? "" : ", ").append(content[i]);
      }
      sb.append(']');
    }
    sb.append('}');
    return sb.toString();
  }
}
