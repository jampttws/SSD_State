package endless.model;

public class Jump extends State{

    public Jump(Player player){
        super(player);
    }

    public void jumpPressed() {
        player.jump();
        player.setState(new DoubleJump(player));
    }

    public void enterGround() {
        player.enterGround();
        player.setState(new StateIdle(player));
    }


}
