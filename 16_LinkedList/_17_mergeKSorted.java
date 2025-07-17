class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return mergeSort(lists, 0, lists.length-1);
    }

    //assume array of heads and not array of linked list
    public ListNode mergeSort(ListNode[] lists, int start, int end) {
        if(start == end) return lists[start]; //only one linked list remains or one head(base case)
        int mid = start + (end - start) / 2;
        ListNode left = mergeSort(lists, start, mid);
        ListNode right = mergeSort(lists, mid + 1, end);
        return merge(left, right);
    }

    //merge 2 sorted list code
    public ListNode merge(ListNode list1, ListNode list2) {
        //initialization
        ListNode mergedList = new ListNode(-1);
        ListNode temp = mergedList;

        //compare and merge
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }

        //if any element remains
        while(list1 != null){
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        while(list2 != null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }

        return mergedList.next;
    }
}
//dont run
