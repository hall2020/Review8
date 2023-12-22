package Review8;

public class Stadium {

    public static void main(String[] args) {

        Sport sport=new Sport("Soccer", "Man City");
        System.out.println(sport.type);
        System.out.println(sport.numberOfPlayers);
        System.out.println(sport.teamName);

       Sport sport1=new Sport("Basketball", "Chicago Bulls",15, "Chicago","Mr.");
        System.out.println(sport1.teamName);
    }
}
