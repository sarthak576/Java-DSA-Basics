class polymorphism{
    
    public static void main(String [] args){
   System.out.println("Hello girl !");
   girl girl_roles = new girl();
   girl_roles.role();
   girl_roles = new daughter();
   girl_roles.role();
   girl_roles = new sister();
   girl_roles.role();
    }
    
}
class girl{
    void role(){
        System.out.println("I am a Girl");
    }
}
class sister extends girl{
    void role(){
        System.out.println("I am a Sister");
    }
}

class daughter extends girl{
    void role(){
        System.out.println("I am a Daughter");
    }
}