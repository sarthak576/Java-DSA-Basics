public class overridding2 {
    public static void main(String[] args) {
 animal myanimal = new animal();
 animal mydog = new dog();

myanimal.sound();
mydog.sound();
    }
    
}
class animal{
    void sound(){
        System.out.println(" I am ANIMAL");
    }
}
class dog extends animal{
    void sound(){
        System.out.println(" I am Dog ");
    }
}
