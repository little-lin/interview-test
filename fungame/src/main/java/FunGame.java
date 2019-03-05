public class FunGame {

    public static void main(String[] args){
        FunGame funGame = new FunGame();
        for(int i = 1;i<=100;i++){
            funGame.thinking(i);
        }
        for(int i = 1;i<=100;i++){
            funGame.thinkingForNewRequirements(i);
        }
    }

    public String thinking(int i){
        StringBuffer result = new StringBuffer();
        if(i%3==0){
            result.append("Fizz");
        }
        if (i%5==0){
            result.append("Buzz");
        }
        if(result.length()==0){
            result.append(Integer.toString(i));
        }
        System.out.println(result.toString());
        return result.toString();
    }


    public String thinkingForNewRequirements(int i){
        StringBuffer result = new StringBuffer();
        if(i%3==0||(Integer.toString(i)).contains("3")){
            result.append("Fizz");
        }
        if (i%5==0||(Integer.toString(i)).contains("5")){
            result.append("Buzz");
        }
        if(result.length()==0){
            result.append(Integer.toString(i));
        }
        System.out.println("new requirements:"+result.toString());
        return result.toString();
    }
}
