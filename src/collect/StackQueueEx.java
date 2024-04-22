package collect;
import java.util.*;
public class StackQueueEx {
    public void stackTest(){
        Stack st = new Stack();
        st.push("0");
        st.push("1");
        st.push("2");
        System.out.println("stack=" + st);
        while( !st.empty() ){
            st.pop();
            System.out.println(st);
        }

    }
    public void queueTest(){
        Queue q = new LinkedList<>();
        q.offer("0");
        q.offer("1");
        q.offer("2");
        System.out.println("Queue=" +q);

        while( !q.isEmpty() ){
            q.poll();
            System.out.println(q);
        }
    }

    public static void main(String[] args) {
        StackQueueEx ex = new StackQueueEx();
        ex.stackTest();
        ex.queueTest();
    }
}
