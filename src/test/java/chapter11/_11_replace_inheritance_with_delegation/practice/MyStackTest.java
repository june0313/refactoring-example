package chapter11._11_replace_inheritance_with_delegation.practice;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MyStackTest {

    private MyStack<Integer> myStack;

    @Before
    public void setUp() {
        myStack = new MyStack<>();
    }

    @Test
    public void push() {
        myStack.push(1);

        assertThat(myStack.size(), is(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void pop() {
        myStack.pop();
    }

    @Test
    public void popTest2() {
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        Integer result = myStack.pop();

        assertThat(result, is(3));
        assertThat(myStack.size(), is(2));
    }
}