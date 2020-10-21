package com.company;


import java.io.IOException;

public class ex {
    public static void main(String[] args){
        BoundedWaitList<Integer> boundedWaitList=new BoundedWaitList<>(10);
        for (int i=0;i<boundedWaitList.getCapacity()+1;i++){
            try{
                boundedWaitList.add(i);
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR");
            }
        }
        System.out.println("Remove first: "+ boundedWaitList.remove());
        System.out.println(boundedWaitList);
        System.out.println("Contains 4: "+boundedWaitList.contains(4));
        System.out.println("Is empty:"+boundedWaitList.isEmpty());
        System.out.println("--------------------------------------");
        UnfairWaitList<String> unfairWaitList= new UnfairWaitList<>();
        unfairWaitList.add("doll");
        unfairWaitList.add("ball");
        unfairWaitList.add("bear");
        System.out.println(unfairWaitList);
        unfairWaitList.remove("doll");
        System.out.println(unfairWaitList);
        System.out.println("Remove :"+unfairWaitList.remove());
        System.out.println("After remove: ");
        System.out.println(unfairWaitList);
        unfairWaitList.moveToBack("ball");
        System.out.println("первый элемент->в конец :"+unfairWaitList);
        System.out.println("Is empty:"+unfairWaitList.isEmpty());
    }
}

