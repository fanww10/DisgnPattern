package main.java.adapter.objectadapter;

public class ObjectAdapter extends Adaptee implements Target{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void request() {
        specificRequest();
    }
}
