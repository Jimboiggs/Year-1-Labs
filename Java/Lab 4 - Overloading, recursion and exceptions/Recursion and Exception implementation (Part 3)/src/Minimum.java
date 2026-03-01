public class Minimum<T extends Compararble<T>> implements TreeMin<T> {
    @Override
    public T minimum(Node<T> node) {
        if (node == null) {
            throw new IllegalArgumentException("Node is null");
        } else if (node instanceof Leaf<T> leaf) {
            return leaf.getValue();
        } else {
            T leftMin = minimum(branch.getLeft);
            T rightMin = minimum(branch.getRight());

            if (leftMin.compareTo(rightMin) > 1){
                return leftMin;
            } else {
                return rightMin;
            }
        }
    }

}
