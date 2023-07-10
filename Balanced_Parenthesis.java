class Balanced_Parenthesis{

    static void func(int n , int oc , int cc , String ans){
        if(oc == n && cc ==n){
            System.out.println(ans);
            return;
        }
        if(oc<n){
            func(n , oc + 1 , cc , ans + "(");
        }
        if(oc>cc){
            func(n , oc , cc+ 1 , ans + ")");
        }    }
    public static void main(String[] args) {
        int n = 2;
        func(n , 0 , 0 ,"");

    }
}