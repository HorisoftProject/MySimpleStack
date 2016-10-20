package simplestack;

import java.util.EmptyStackException;

/**
 * Created by mathieukostiuk on 20/10/2016.
 */
public class Stack implements SimpleStack {


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Object item) {

    }

    @Override
    public Object peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Object pop() throws EmptyStackException {
        return null;
    }
}
