package endless.model;

public class DoubleJump extends State{

    public DoubleJump(Player player){
        super(player);
    }

    public void enterGround() {
        player.enterGround();
        player.setState(new StateIdle(player));
    }
}
