public class FunGame {

    public static void main(String[] args){
        FunGame funGame = new FunGame();
        for(int i = 1;i<=100;i++){
            System.out.println(funGame.thinking(i));
        }

        for(int i = 1;i<=100;i++){
            System.out.println("new requirements:"+ funGame.thinkingForNewRequirements(i));
        }
    }

    public String thinking(int i){
        String result = null;
        if(i%15==0){
            result = "FizzBuzz";
        }else if(i%3==0){
            result = "Fizz";
        }else if(i%5==0){
            result = "Buzz";
        }else{
            result = Integer.toString(i);
        }
        return result;
    }


    public String thinkingForNewRequirements(int i){
        String result = null;
        if(i%15==0||(i%5==0&&(Integer.toString(i)).contains("3"))||(i%3==0||(Integer.toString(i)).contains("5"))||((Integer.toString(i)).contains("3")||(Integer.toString(i)).contains("5"))){
            result = "FizzBuzz";
        }else if(i%3==0||(Integer.toString(i)).contains("3")){
            result = "Fizz";
        }else if(i%5==0||(Integer.toString(i)).contains("5")){
            result = "Buzz";
        }else{
            result = Integer.toString(i);
        }
        return result;
    }
}
