package merkle;

/**
 * Created by rsingh13.
 *
 * This merkle tree is perfect Binary Tree
 *
 * If there are total n rows in the file ,
 * 1. There will be n hashes
 * 2. There will be n leaves in the perfect binary tree.
 * 3. So the max height can be SQRT (n) since this tree is perfect binary tree.
 */

public class MerkleTree {


    private final LeafNode root;

    public MerkleTree() {
        root = new LeafNode( null );
    }
    public void init() {

    }

}
