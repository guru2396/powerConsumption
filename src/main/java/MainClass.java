public class MainClass {

    public static void main(String[] args){
        System.out.println("Program started");
        for(int i=0;i<50;i++){
            System.out.println("Loop: "+(i+1));
        }
        System.out.println("Program ended");
    }

    public static int add(int a,int b){
        return a+b;
    }
}
