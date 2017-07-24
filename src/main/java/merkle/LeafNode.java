package merkle;

/**
 * Created by rsingh13.
 * merkle.LeafNode containing the hash value of a row or bunch of rows.
 */
class LeafNode implements HashableNode {

    private final byte[] hash;

    public LeafNode(byte[] hash) {
        this.hash = hash;
    }

    @Override
    public byte[] hash() {
        return new byte[0];
    }
}
