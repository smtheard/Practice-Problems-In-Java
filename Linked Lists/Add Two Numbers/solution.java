import java.util.*;

class Solution {
    public static ArrayList<Integer> createDigitArray(long num) {
        ArrayList<Integer> digitArr = new ArrayList<Integer>();
        while(num * 10 > 9) {
            Integer int_num = (int)(long)(num % 10);
            digitArr.add(int_num);
            num = num / 10;
        }
        return digitArr;
    }

    public static void setNumber(ListNode node, long num) {
        ArrayList<Integer> digitArr = createDigitArray(num);
        for(int i = 0; i < digitArr.size(); i++){
            node.val = digitArr.get(i);
            if(i + 1 < digitArr.size()){
                node.next = new ListNode(0);
                node = node.next;
            }
        }
    }

    public static long getNumber(ListNode node) {
        if(node == null)
            return 0;
        return node.val + getNumber(node.next) * 10;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long l1num = getNumber(l1);
        long l2num = getNumber(l2);
        ListNode root = new ListNode(0);
        setNumber(root, l1num+l2num);
        return root;
    }

    public static void printList(ListNode node){
        if(node == null){
            System.out.println();
            return;
        }
        else
            System.out.print(node.val + " ");
        printList(node.next);
    }
	public static void main(String[] args) {
        ListNode root = new ListNode(9);
        ListNode root2 = new ListNode(0);
        long bigNum = 9999999991l;
        setNumber(root2, bigNum);
        System.out.println("List 1");
        printList(root);
        System.out.println("List 2");
        printList(root2);
        System.out.println("List Combined");
        printList(addTwoNumbers(root, root2));
	}
}