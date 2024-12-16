class inheritence{
    public static void main(String [] args ){
   beta merebete =new beta(); // merebete - obj , beta - class call (constructor)
   merebete.eat(); 
// merebete.play();


    }
}
class baap{
    public void  eat(){
     System.out.println("beta khana kha lo... ");
    }
}
class beta extends baap{
    public void play(){
        System.out.println("lets play papa");
    }
}