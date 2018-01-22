import java.util.*;

public class Node {

  // Instanzvariablen
  private int value;
  private int key;

  // Konstruktor
  public Node(int key, int value) {
    this.key=key;
    this.value=value;
  }

  public Node(int key) {
    this.key=key;
  }

  // Methoden
  public int getKey(){
    return this.key;
  }

}
