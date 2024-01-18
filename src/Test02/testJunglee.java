package Test02;



public class testJunglee {

    private static testJunglee test = null;
        private testJunglee(){

    }

    public static testJunglee getInstance(){
            if(test == null){
                test = new testJunglee();
            }
            return test;
    }


}
