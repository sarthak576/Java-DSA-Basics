class exception{
    public static void main(String [] args ){

        try{
            int ratio = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Running Program success !");
        }
    }
}