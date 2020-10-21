package com.company;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    BoundedWaitList( int capacity){
        this.capacity=capacity;
    }
    int getCapacity(){
        return capacity;
    }
    @Override
    public void add(E element){
        if(content.size()<capacity){
            super.add(element);
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
