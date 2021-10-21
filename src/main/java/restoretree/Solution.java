package main.java.restoretree;


import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        int[] preOrder = {1,2,4,7,3,5,6,8};
        int[] midOrder = {4,7,2,1,5,3,8,6};
        BinaryTree originTree = restoreTree(preOrder, midOrder);
        ArrayList<Integer> list = printBinaryTree(originTree);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    private static int getDivide(int[] preOrder, int[] midOrder) {
        int i = 0;
        while(preOrder[0] != midOrder[i]) {
            i++;
        }
        return i;
    }

    private static BinaryTree restoreTree(int[] preOrder, int[] midOrder, int preStart, int preEnd, int midStart, int midEnd){
        if (preStart > preEnd || midStart > midEnd) {
            return null;
        }
        BinaryTree rootNode = new BinaryTree(preOrder[preStart]);
        int pos = 0;
        for (int i = midStart; i <= midEnd; i++) {
            if (preOrder[preStart] == midOrder[i]) {
                pos = i;
                break;
            }
        }
        rootNode.leftChildTree = restoreTree(preOrder, midOrder, preStart + 1, preStart + pos - midStart, midStart, pos - 1 );
        rootNode.rightChildTree = restoreTree(preOrder, midOrder, preStart + pos + 1, preEnd, pos + 1, midEnd);
        return rootNode;

    }

    private static BinaryTree restoreTree(int[] preOrder, int[] midOrder) {
        return restoreTree(preOrder, midOrder, 0, preOrder.length -1, 0, midOrder.length -1 );
    }

    private static ArrayList<Integer> printBinaryTree(BinaryTree binaryTree) {
        ArrayList<Integer> list = new ArrayList<>();
        if (binaryTree == null) {
            return list;
        }
        LinkedList<BinaryTree> queue = new LinkedList<>();
        BinaryTree current;
        int cur,last;
        queue.add(binaryTree);
        while(!queue.isEmpty()){
            cur = 0;
            last = queue.size();
            while(cur < last){
                current = queue.poll();
                list.add(current.value);
                cur++;
                if (current.leftChildTree != null) {
                    queue.add(current.leftChildTree);
                }
                if (current.rightChildTree != null) {
                    queue.add(current.rightChildTree);
                }
            }
        }
        return list;
    }

}
