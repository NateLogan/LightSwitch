package mn.aPunch.LightSwitch;

import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;

public class LightSwitchPlayerListener extends PlayerListener {

    @Override
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.isCancelled()) {
            return;
        }
        if (event.hasBlock()) {
            LightSwitchBlockListener.changePumpkinState(event.getClickedBlock());
        }
    }
}
