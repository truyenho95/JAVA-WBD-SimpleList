import java.util.Arrays;

public class MyList<E> {
  private int size = 0;
  private static final int DEAFAULT_CAPACITY = 10;
  private Object elements[];

  public MyList() {
    elements = new Object[DEAFAULT_CAPACITY];
  }

  private void ensureCapa() {
    int newSize = elements.length * 2;
    elements = Arrays.copyOf(elements, newSize);
  }

  public void add(E e) {
    if (size == elements.length) {
      ensureCapa();
    }
    elements[size++] = e;
  }

  public E get(int index) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
    }

    return (E) elements[index];
  }
}
