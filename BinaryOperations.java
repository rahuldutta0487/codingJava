public class BinaryOperations {
    public static void main(String[] args){
        String s="1111010101111";
        int res=solutions(s);
        System.out.println(res);

    }
    static int solutions(String S){
        int res=0;
        int i=0;
        while(i<S.length() && S.charAt(i) == '0'){
            i++;
        }
        if(i == S.length()){
            return 0;
        }
        while(i<S.length()){
            char bits=S.charAt(i);

            if(bits == '0'){
                res += 1;
            } else {
                res += 2;
            }
            i++;
        }
        return res-1;
    }
}

