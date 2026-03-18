public class swappingSolve {
    public static void main(String[] args){
        String S="29162";
        String T="10524";
        int result=solution(S,T);
        System.out.println( result);

    }
    static int solution(String S,String T){
        int n=S.length();
        int position = 0;
        int swapping =0;
        for(int i=0;i<n;i++){
            int k=S.charAt(i);
            int p=T.charAt(i);

            if(k==p) continue;

            if(position==0)
            {
                if(k>p){
                    position =1;
                } else {
                    position =-1;
                }
            } else if(position ==1){
                if(k>p){
                    swapping++;
                }
            } else {
                if(k<p){
                    swapping++;
                }
            }
        }
        return swapping;
    }
}
