class Solution {
    public static void main(String[] args){
        char[] letters = {'a', 'a', 'b', 'f', 'x', 'z'};
        System.out.println(nextGreatestLetter(letters, 'h');
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]){
            return letters[0];
        }
        int start = 0, end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            } else { 
                start=mid+1;
            }
        }
        return letters[start];
    }
}
