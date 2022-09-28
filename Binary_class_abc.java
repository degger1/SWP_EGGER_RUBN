public class Binary_class_abc {
    public static int BinABCSearch(char[] array, char key){
       int low = 0;
       int high = array.length - 1;

        while(low<=high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key)
                return mid;

            if(array[mid] > key)
                high = mid - 1;
            if (array[mid] < key)
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        char[] array = {'a','b','c','d','e','f'};
        System.out.println(BinABCSearch(array, 'a'));

    }

}
