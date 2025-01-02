public class test4 {
    public static void main(String[] args) {
        String num = "abhinav";
        int arr[] = new int[26]; 
        for (int i = 0; i < num.length(); i++) {
            arr[num.charAt(i) - 'a']++;
        }
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char)('a'+i) +""+ arr[i]+ " ");
        }
    }
    
}
