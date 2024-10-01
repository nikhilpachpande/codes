package crackit;

public class ArrayJumpingTillYouFindEnd {

    public static void main(String[] args) {
        ArrayJumpingTillYouFindEnd a = new ArrayJumpingTillYouFindEnd();
        
        Integer[] arr = {1, 2, 0, 3, 0, 0};
//        Integer[] arr = {0, 0, 0, 0, 0, 0};
        
        System.out.println(a.test(arr));
    }
    
    public boolean test(Integer[] arr) {
        int l = arr.length;
        
        if (l == 0 || arr[0] == 0) return false;
        
        int j = 0;
        
        while (j < l) {
            j = arr[j] + j;
            if (j >= l) return true;
            if (arr[j] == 0) return false; // Check if next jump lands on zero
        }
        
        return false;
    }
}
