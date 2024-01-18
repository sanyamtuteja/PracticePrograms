package Test02;

public class output {
        public  static void main(String[] args)
        {
            int n = someMethod(1);
        }

        public static int someMethod(int i){
            try{
                System.out.println("try");
                return 1;
            }catch(Exception e){
                System.out.println("catch");
                return 999;
            }finally{
                System.out.println("finally");
                //finally block statements
            }
        }
}
