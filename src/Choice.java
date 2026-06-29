public enum Choice {
    ROCK("камень"),
    PAPER("бумага"),
    SCISSORS("ножницы"),
    NONE;
    private final String message;
    Choice(){
        message="";
    }
    Choice(String message){
        this.message=message;
    }
}
