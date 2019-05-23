package endless.model;

public class StateIdle extends State{

    public StateIdle(Player player) {
        super(player);
    }

    public void jumpPressed(){
        player.jump();
        player.setState(new Jump(player));
    }

    public  void crawlPressed(){
        player.crawl();
        player.setState(new Crawl(player));
    }

}
