//  different datatypes with same funtion name 
public class overloading2 {
    public static void main(String [] args ){
      int interger_result = add(10,990);
     double Double_result = add(23.0,87.01);
     float Float_result = add(100, 10);
     System.out.println("Integer result: "+interger_result);
     System.out.println("Double result: "+Double_result);
     System.out.println("Float result: "+Float_result);

    }
    public static int add(int x,int y){
        return x + y;
    }
    public static double add(double x,double y){
        return x + y ;
    }
    public static float add(float a, float b){
        return a +b;
    }
}
