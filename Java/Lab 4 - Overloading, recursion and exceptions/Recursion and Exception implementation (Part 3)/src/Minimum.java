public class Minimum<T extends Comparable<T>> implements TreeMin<T> {
    @Override
    public T minimum(Node<T> node) {
        if (node == null) {
            throw new IllegalArgumentException("Node is null");
        } else if (node instanceof Leaf<T> leaf) {
            return leaf.getValue();
        } else if (node instanceof Branch<T> branch) {
            if (branch.getLeft() == null || branch.getRight() == null) {
                throw new IllegalArgumentException("Branch has null child");
            }

            T leftMin = minimum(branch.getLeft());
            T rightMin = minimum(branch.getRight());

            if (leftMin.compareTo(rightMin) < 0){
                return leftMin;
            } else {
                return rightMin;
            }
        }
        throw new IllegalArgumentException("Invalid node type");
    }

}
