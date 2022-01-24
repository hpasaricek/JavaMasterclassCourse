public class Main {
    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();
        int[] ints = sortedArray.getIntegers(5);


                sortedArray.printArray(ints);
        sortedArray.printArray(sortedArray.sortIntegers(ints));

    }
}
