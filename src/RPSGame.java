import java.util.Scanner;
public class RPSGame {
    static Scanner sc = new Scanner(System.in);
    public static void start(){
        System.out.println("Камень ножницы бумага: игра идёт до 3 побед");
        game();
    }
    public static  void game(){
        boolean isWin=false;
        int playerScore = 0;
        int playerNum=0;
        int computerScore=0;
        int computerNum=0;
        Choice playerChoice=Choice.NONE;
        Choice computerChoice=Choice.NONE;
        while(playerScore<3&&computerScore<3){
            System.out.println("Введите число от 1 до 3: \n1.Камень\n2.Ножницы\n3.Бумага");
            playerNum=sc.nextInt();
            if(playerNum<1||playerNum>3){
                System.out.println("Некорректный ввод!");
                continue;
            }
            if(playerNum==1){
                playerChoice=Choice.ROCK;
            }else if(playerNum==2){
                playerChoice=Choice.SCISSORS;
            }else if(playerNum==3){
                playerChoice=Choice.PAPER;
            }
            computerNum=(int)(Math.random()*3)+1;
            if(computerNum==1){
                computerChoice=Choice.ROCK;
            }else if(computerNum==2){
                computerChoice=Choice.SCISSORS;
            }else if(computerNum==3){
                computerChoice=Choice.PAPER;
            }
            if(playerChoice==computerChoice){
                System.out.println("Ничья!Вы выбрали "+playerChoice);
            }
        }

    }
}
