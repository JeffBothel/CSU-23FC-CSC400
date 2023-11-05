import java.util.LinkedList;
import java.util.Queue;

public class Discussion {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < 10; i++) {
            q.add(i);
        }
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q);
    }
}
