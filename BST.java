public class BST {

    public TreeNode createNewNode(int val){
        TreeNode root=new TreeNode(val);

        return root;
    }

    void insertNode(TreeNode root, int key){

        if(key<root.val){//executes if the data will go left of root
            if(root.left==null){// checks if the node is a leaf node
                root.left=new TreeNode(key);// adds the node
            }
            else{
                insertNode(root.left, key); // sends the left of the root an the new root
            }
        }
        if(key>root.val){ // same shit but on right side of the tree
            if(root.right==null){
                root.right=new TreeNode(key);
            }
            else{
                insertNode(root.right, key);
            }
        }
    }

    boolean checkifleaf(TreeNode node){
        if(node.left==null&&node.right==null){return true;}//checks if the node is a leaf node or not
        return false;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root; // If key is not found, return original root
        }

        // Recursive search for the node to be deleted
        if (key < root.val) {
            root.left = deleteNode(root.left, key); // Key is in the left subtree
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key); // Key is in the right subtree
        } else {
            // Node with the key has been found

            // Case 1: Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Node with two children
            root.val = minValue(root.right); // Replace the node's value with the inorder successor
            root.right = deleteNode(root.right, root.val); // Delete the inorder successor
        }

        return root;
    }

    public int minValue(TreeNode node) {
        int minValue = node.val;
        while (node.left != null) {
            minValue = node.left.val;
            node = node.left;
        }
        return minValue;
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.val == key) {
            return clone(root); // Node with the key is found or the tree is empty
        }

        if (key < root.val) {
            TreeNode leftSubtree = search(root.left, key); // Search in the left subtree
            if (leftSubtree != null) {
                TreeNode clonedRoot = clone(root); // Clone the root node
                clonedRoot.left = leftSubtree; // Set the cloned left subtree
                return clonedRoot;
            }
        } else {
            TreeNode rightSubtree = search(root.right, key); // Search in the right subtree
            if (rightSubtree != null) {
                TreeNode clonedRoot = clone(root); // Clone the root node
                clonedRoot.right = rightSubtree; // Set the cloned right subtree
                return clonedRoot;
            }
        }

        return null; // Key is not found in the tree
    }

    public TreeNode clone(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode clonedNode = new TreeNode(node.val);
        clonedNode.left = clone(node.left);
        clonedNode.right = clone(node.right);
        return clonedNode;
    }

    public TreeNode searchDraw(TreeNode clone, int key){
        boolean notfound=true;
        TreeNode temp=clone;
        
        while(notfound){
            if(temp.val==key){
                notfound=false;
                temp.right=null;
                temp.left=null;
            }
            else if(temp.val<key){
                temp.left=null;
                temp=temp.right;
            }
            else if(temp.val>key){
                temp.right=null;
                temp=temp.left;
            }
        }
        return clone;
    }
    
}