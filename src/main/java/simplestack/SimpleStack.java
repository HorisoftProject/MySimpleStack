package simplestack;

import java.util.EmptyStackException;

/**
 * Created by mathieukostiuk on 20/10/2016.
 */
public interface SimpleStack {
    public boolean isEmpty();

    public int getSize();

    public void push(Object item);

    public Object peek() throws EmptyStackException;

    public Object pop() throws EmptyStackException;
}
