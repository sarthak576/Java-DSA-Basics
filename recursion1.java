// Use recursion to add all of the numbers up to 10.
class recursion1 {
    public static void main(String [] args ){
         int result=sum(10);
         System.out.println("sum : "+result);
    }
    
    public static int sum(int k){
        if (k>0) {
            return k + (sum(k-1)) ;

        }
        else {
            return 0;
        }
    }

}