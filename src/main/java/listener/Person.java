package main.java.listener;

/**
 * @author create by wwfan2
 * @data 2021/10/21 10:29
 * @description
 */

public class Person {
    private PersonListener mListener;
    public void registerListener (PersonListener listener) {
        this.mListener = listener;
    }

    public void onClick() {
        mListener.onClick();
    }
}
