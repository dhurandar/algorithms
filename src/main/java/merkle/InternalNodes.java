package merkle;

/**
 * Created by rsingh13.
 *
 * Non leaf nodes of Merkle tree.
 * The hash value here is xor of its leafs.
 */
class InternalNodes implements HashableNode{

    private HashableNode left;
    private HashableNode right;

    private byte[] hash;

    public InternalNodes(HashableNode left , HashableNode right) {
        setLeft( left );
        setRight( right );
    }

    public HashableNode getLeft() {
        return left;
    }


    private void setLeft(HashableNode left) {
        this.left = left;
    }

    public HashableNode getRight() {
        return right;
    }

    private void setRight(HashableNode right) {
        this.right = right;
    }


    @Override
    public byte[] hash() {
        return hash( getLeft().hash(),getRight().hash() );
    }
}
