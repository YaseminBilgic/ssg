package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1=new LinkedList<>();
        List<Integer> ll3=new LinkedList<>();
        Deque<Integer> ll2=new LinkedList<>();
        Queue<Integer> ll4=new LinkedList<>();
        ll4.add(2);
        ll4.add(4);
        ll4.add(6);
        ll4.add(8);
        System.out.println(ll4);
        ll4.remove();
        System.out.println(ll4);
        ll1.add(1,4);

    }
}
