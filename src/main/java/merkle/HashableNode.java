package merkle;

import util.BitwiseOperators;

/**
 * Created by rsingh13.
 */
interface HashableNode {

    default public byte[] hash(byte[] left , byte[] right) {
        return BitwiseOperators.xor( left,right );
    }

    public byte[] hash();

}
