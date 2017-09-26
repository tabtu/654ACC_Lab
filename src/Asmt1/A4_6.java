package Asmt1;

import Asmt1.searchtrees.BinarySearchTree;
import Asmt1.searchtrees.AVLTree;
import Asmt1.searchtrees.RedBlackTree;
import Asmt1.searchtrees.SplayTree;

public class A4_6 {
    public static void main( String [ ] args ) {
        int numItems = 100000;
        long start, end;
        String tmus = "";

        System.out.println("Start to Fill...");
/*
        // BinarySearchTree
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        // Insert with Order
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            bst.insert(i + 1);
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",bst_i;";
        // Search with Random in Order Tree
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            bst.contains(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",bst_s;";
        // Remove with Order
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            bst.remove(i);
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",bst_r;";
        System.out.println(tmus);
*/
        // AVLTree
        AVLTree<Integer> avlt = new AVLTree<>();
        // Insert in Order
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            avlt.insert(i + 1);
            avlt.checkBalance( );
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",avlt_i;";
        // Search with Random in Order Tree
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            avlt.contains(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",avlt_s;";
        // Remove with Order
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            avlt.remove(i);
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",avlt_r;";
        System.out.println(tmus);

        // RedBlackTree
        RedBlackTree<Integer> rbt = new RedBlackTree<>();
        // Insert in Order
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            rbt.insert(i + 1);
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",rbt_i;";
        // Search with Random in Order Tree
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            rbt.contains(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",rbt_s;";
        // Remove with Order
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            rbt.remove(i);
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",rbt_r;";
        System.out.println(tmus);

        // SplayTree
        SplayTree<Integer> st = new SplayTree<>();
        // Insert in Order
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            st.insert(i + 1);
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",st_i;";
        // Search with Random in Order Tree
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            st.contains(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",st_s;";
        // Remove with Order
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            st.remove(i);
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",st_r;";
        System.out.println(tmus);


/*        // Step 5
        // BinarySearchTree
        // Insert with Random Numbers
        bst.makeEmpty();
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            bst.insert(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",bst_iR;";
        // Search with Random in Random Tree
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            bst.contains(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",bst_sR;";
        // Remove in Random
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            bst.remove(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",bst_rR;";
        bst.makeEmpty();

        // AVLTree
        // Insert with Random Numbers
        avlt.makeEmpty();
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            avlt.insert(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",avlt_iR;";
        // Search with Random in Random Tree
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            avlt.contains(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",avlt_sR;";
        // Remove in Random
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            avlt.remove(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",avlt_rR;";
        avlt.makeEmpty();

        // RedBlackTree
        // Insert with Random Numbers
        rbt.makeEmpty();
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            rbt.insert(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",rbt_iR;";
        // Search with Random in Random Tree
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            rbt.contains(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",rbt_sR;";
        // Remove in Random
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            rbt.remove(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",rbt_rR;";
        rbt.makeEmpty();

        // SplayTree
        // Insert with Random Numbers
        st.makeEmpty();
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            bst.insert(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",st_iR;";
        // Search with Random in Random Tree
        start = System.currentTimeMillis();
        for (int i = 0; i < numItems; i++) {
            st.contains(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",st_sR;";
        // Remove in Random
        start = System.currentTimeMillis();
        for (int i = numItems; i > 0; i--) {
            st.remove(ExtFuns.getRandomNumber(numItems));
        }
        end = System.currentTimeMillis();
        tmus += (end - start) + ",st_rR;";
        st.makeEmpty();
        */

        System.out.println(tmus);

        System.out.println("Finished...");
    }
}
