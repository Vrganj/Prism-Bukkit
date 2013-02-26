package me.botsko.prism;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class PrismConfig extends ConfigBase {

	
	/**
	 * 
	 * @param plugin
	 */
	public PrismConfig(Plugin plugin) {
		super(plugin);
	}
	

	/**
	 * 
	 * @param plugin
	 */
	public FileConfiguration getConfig(){
		
		config = plugin.getConfig();
		
		// set defaults
		config.addDefault("prism.debug", false);
//		config.addDefault("prism.language", "en-us");
		
		config.addDefault("prism.notify-newer-versions", true);
		config.addDefault("prism.allow-metrics", true);
			
		config.addDefault("prism.database.mode", "mysql"); // sqlite or mysql
		// Some finer configs we hope people don't need to mess with
		config.addDefault("prism.database.max-pool-connections", 20);
		config.addDefault("prism.database.max-wait", 30000);
		config.addDefault("prism.database.actions-per-insert-batch", 1000);

		config.addDefault("prism.mysql.hostname", "127.0.0.1");
		config.addDefault("prism.mysql.username", "root");
		config.addDefault("prism.mysql.password", "");
		config.addDefault("prism.mysql.database", "minecraft");
		config.addDefault("prism.mysql.port", "3306");
		
		config.addDefault("prism.default-radius", 5);
		config.addDefault("prism.default-time-since", "3d");
		config.addDefault("prism.max-radius-unless-overridden", 100);
		
		config.addDefault("prism.limit-global-radius-override-to-lookups", true);
		config.addDefault("prism.always-show-extemded", false);
		
		config.addDefault("prism.near.default-radius", 5);
		config.addDefault("prism.drain.max-radius", 10);
		config.addDefault("prism.drain.default-radius", 5);
		
		config.addDefault("prism.ex.max-radius", 100);
		config.addDefault("prism.ex.default-radius", 10);
		
		config.addDefault("prism.ignore.players-in-creative", false);
		config.addDefault("prism.ignore.players", new ArrayList<String>());
		config.addDefault("prism.ignore.worlds", new ArrayList<String>());
		
		List<String> purgeRules = new ArrayList<String>();
		purgeRules.add("before:8w");
		purgeRules.add("a:water-flow before:4w");
		config.addDefault("prism.db-records-purge-rules", purgeRules);
		
		config.addDefault("prism.appliers.allow_rollback_items_removed_from_container", true);
		config.addDefault("prism.appliers.notify-nearby.enabled", true);
		config.addDefault("prism.appliers.notify-nearby.additional-radius", 20);
		config.addDefault("prism.appliers.remove-fire-on-burn-rollback", true);
		config.addDefault("prism.appliers.remove-drops-on-explode-rollback", true);
		
		config.addDefault("prism.tracking.block-break", true);
		config.addDefault("prism.tracking.block-burn", true);
		config.addDefault("prism.tracking.block-fade", true);
		config.addDefault("prism.tracking.block-fall", true);
		config.addDefault("prism.tracking.block-form", true);
		config.addDefault("prism.tracking.block-place", true);
		config.addDefault("prism.tracking.block-shift", true);
		config.addDefault("prism.tracking.block-spread", true);
		config.addDefault("prism.tracking.block-use", true);
		config.addDefault("prism.tracking.bucket-fill", true);
		config.addDefault("prism.tracking.bonemeal-use", true);
		config.addDefault("prism.tracking.container-access", true);
		config.addDefault("prism.tracking.craft-item", false);
		config.addDefault("prism.tracking.creeper-explode", true);
		config.addDefault("prism.tracking.crop-trample", true);
		config.addDefault("prism.tracking.enchant-item", false);
		config.addDefault("prism.tracking.enderman-pickup", true);
		config.addDefault("prism.tracking.enderman-place", true);
		config.addDefault("prism.tracking.entity-break", true);
		config.addDefault("prism.tracking.entity-dye", false);
		config.addDefault("prism.tracking.entity-explode", true);
		config.addDefault("prism.tracking.entity-follow", true);
		config.addDefault("prism.tracking.entity-form", true);
		config.addDefault("prism.tracking.entity-kill", true);
		config.addDefault("prism.tracking.entity-shear", true);
		config.addDefault("prism.tracking.entity-spawn", true);
		config.addDefault("prism.tracking.fireball", true);
		config.addDefault("prism.tracking.hangingitem-break", true);
		config.addDefault("prism.tracking.hangingitem-place", true);
		config.addDefault("prism.tracking.item-drop", true);
		config.addDefault("prism.tracking.item-insert", true);
		config.addDefault("prism.tracking.item-pickup", true);
		config.addDefault("prism.tracking.item-remove", true);
		config.addDefault("prism.tracking.lava-break", true);
		config.addDefault("prism.tracking.lava-bucket", true);
		config.addDefault("prism.tracking.lava-flow", false);
		config.addDefault("prism.tracking.lava-ignite", true);
		config.addDefault("prism.tracking.leaf-decay", true);
		config.addDefault("prism.tracking.lighter", true);
		config.addDefault("prism.tracking.lightning", true);
		config.addDefault("prism.tracking.mushroom-grow", true);
		config.addDefault("prism.tracking.player-chat", false);
		config.addDefault("prism.tracking.player-command", false);
		config.addDefault("prism.tracking.player-death", true);
		config.addDefault("prism.tracking.player-join", false);
		config.addDefault("prism.tracking.player-quit", false);
		config.addDefault("prism.tracking.player-teleport", false);
		config.addDefault("prism.tracking.potion-splash", true);
		config.addDefault("prism.tracking.sheep-eat", true);
		config.addDefault("prism.tracking.sign-change", true);
		config.addDefault("prism.tracking.spawnegg-use", true);
		config.addDefault("prism.tracking.tnt-explode", true);
		config.addDefault("prism.tracking.tnt-prime", true);
		config.addDefault("prism.tracking.tree-grow", true);
		config.addDefault("prism.tracking.water-break", true);
		config.addDefault("prism.tracking.water-bucket", true);
		config.addDefault("prism.tracking.water-flow", false);
		config.addDefault("prism.tracking.world-edit", false);
		config.addDefault("prism.tracking.xp-pickup", false);
		
		config.addDefault("prism.track-player-ip-on-join", false);
		
		config.addDefault("prism.wands.default-mode", "hand"); // hand, item, or block
		config.addDefault("prism.wands.default-item-mode-id", "280:0");
		config.addDefault("prism.wands.default-block-mode-id", "17:1");
		config.addDefault("prism.wands.auto-equip", true);
		
		List<String> ignoreActionsForInspect = new ArrayList<String>();
		ignoreActionsForInspect.add("player-chat");
		ignoreActionsForInspect.add("player-command");
		ignoreActionsForInspect.add("player-join");
		ignoreActionsForInspect.add("player-quit");
		config.addDefault("prism.wands.inspect.ignore-actions", ignoreActionsForInspect);
		
		List<String> doNotTrackCommand = new ArrayList<String>();
		doNotTrackCommand.add("vanish");
		doNotTrackCommand.add("v");
		doNotTrackCommand.add("login");
		doNotTrackCommand.add("changepassword");
		doNotTrackCommand.add("register");
		doNotTrackCommand.add("unregister");
		config.addDefault("prism.do-not-track.commands", doNotTrackCommand);
		
		config.addDefault("prism.alerts.alert-staff-to-applied-process", true);
		config.addDefault("prism.alerts.ores.enabled", true);
		config.addDefault("prism.alerts.ores.ignore-staff", true);
		config.addDefault("prism.alerts.ores.log-to-console", true);
		config.addDefault("prism.alerts.ores.coal", false);
		config.addDefault("prism.alerts.ores.redstone", false);
		config.addDefault("prism.alerts.ores.lapis", true);
		config.addDefault("prism.alerts.ores.iron", true);
		config.addDefault("prism.alerts.ores.gold", true);
		config.addDefault("prism.alerts.ores.diamond", true);
		config.addDefault("prism.alerts.ores.emerald", true);
		
		config.addDefault("prism.alerts.illegal-commands.enabled", false);
		
		List<String> illegal_commands = new ArrayList<String>();
		illegal_commands.add("op");
		illegal_commands.add("deop");
		illegal_commands.add("stop");
		illegal_commands.add("reload");
		config.addDefault("prism.alerts.illegal-commands.commands", illegal_commands);
		
		// Enable monitoring of item use/placement
		config.addDefault("prism.alerts.uses.enabled", true);
		config.addDefault("prism.alerts.uses.ignore-staff", true);
		config.addDefault("prism.alerts.uses.lighter", true);
		config.addDefault("prism.alerts.uses.lava", true);
		
		List<String> monitorItems = new ArrayList<String>();
		monitorItems.add("7");
		monitorItems.add("29");
		monitorItems.add("46");
		monitorItems.add("10");
		monitorItems.add("11");
		config.addDefault("prism.alerts.uses.item-placement", monitorItems);
		
		monitorItems = new ArrayList<String>();
		config.addDefault("prism.alerts.uses.item-break", monitorItems);
		
		config.addDefault("prism.alerts.vanilla-xray.enabled", true);
		
		config.addDefault("prism.queue-empty-tick-delay", 3);
		
		// Copy defaults
		config.options().copyDefaults(true);
		
		// save the defaults/config
		plugin.saveConfig();
		
		return config;
		
	}
}
