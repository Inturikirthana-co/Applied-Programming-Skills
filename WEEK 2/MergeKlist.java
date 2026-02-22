import java.util.PriorityQueue;

class MergeKlist {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        
        for (ListNode node : lists) {
            if (node != null)
                pq.add(node);
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (!pq.isEmpty()) {

            ListNode smallest = pq.poll();
            current.next = smallest;
            current = current.next;

            if (smallest.next != null)
                pq.add(smallest.next);
        }

        return dummy.next;
    }
}
