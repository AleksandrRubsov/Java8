package com.company;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList(){
        super();
    }
    void remove(E element){
        if(content.peek()!=element) content.remove(element);
    }
    void moveToBack(E element){
          if(contains(element)){
              content.add(element);
              content.remove();
          }else{
              content.add(element);
          }
    }
}
