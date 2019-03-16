package StackArrayList;

import java.util.ArrayList;


/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
   private ArrayList<E> elements;


    public Stack(){
        elements = new ArrayList<>();

    }

    public boolean isEmpty() {
        if(elements.size() ==0){
            return true;
        }

        return false;
    }

    public void push(E foobar) {
        elements.add(foobar);
    }


    public E pop() {
        if(elements.size()>0){

            E temp = elements.get(elements.size() - 1);
            elements.remove(elements.size()-1);
            return temp;
        } else
            return (E) elements.remove(0);


    }
}
