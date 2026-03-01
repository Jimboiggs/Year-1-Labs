public class Minimum<T extends Comparable<T>> implements ArrayMin<T> {
    @Override
    public T minimum (T[] array) {
        if (array == null ||array.length == 0) {
            throw new IllegalArgumentException("No array");
        } else if (array.length == 1) {
            return array[0];
        } else if (array[0].compareTo(array[1]) > 0) {
            T[] rest = java.util.Arrays.copyOfRange(array, 1, array.length);
            return minimum(rest);
        } else if (array[0].compareTo(array[1]) < 0) {
            T[] rest = (T[]) new Comparable[array.length - 1];
            System.arraycopy(array, 0, rest, 0, 1);
            System.arraycopy(array, 2, rest, 1, array.length - 2);
            return minimum(rest);
        }
        return null;
    }
}
