package com.matias;

import javax.tools.StandardJavaFileManager;
import java.util.Arrays;

public class Vetor {

    private Object[] elements;
    private int size = 0;

    public Vetor(int capacity){
        elements = new Object[capacity];
        size = 0;
    }

    public void adiciona(Object o){
      if (this.size>=this.elements.length){
          resize();
      }
      elements[size] = o;
      size++;
    }

    public int tamanho(){
        return size;
    }

    private void resize() {
        Object[] elementsNew = new Object[elements.length * 2];
        for (int i=0;i<elements.length;i++){
            elementsNew[i] = elements[i];
        }
        this.elements = elementsNew;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
