public class subsets {
    public static void findSubsets(String Str,String ans,int i){
        //base case
        if(i==Str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
            System.out.println(ans);
        }
            return;
    }
        //yes case
        findSubsets(Str, ans+Str.charAt(i), i+1);
        //no case
        findSubsets(Str,ans,i+1); 
    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str," ",0);

    }
}
