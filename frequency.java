public class frequency{
    public static void main(String[] args) {
        String str = "banana";
        char[] as = str.toCharArray(); //
        char target = 'a';
        int count = 0;
        for(int i =0;i<as.length;i++) {
            if(as[i] == target){
                count++;
            }
        }
        System.out.println("Frequency of " + target + " is: " + count);

    
}
}
