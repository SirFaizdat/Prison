/**
 * (C) 2014 SirFaizdat
 */
package me.sirfaizdat.prison.mines;

import me.sirfaizdat.prison.core.AbstractCommandManager;
import me.sirfaizdat.prison.core.Component;
import me.sirfaizdat.prison.mines.cmds.*;

/**
 * @author SirFaizdat
 */
public class MinesCommandManager extends AbstractCommandManager {

    public MinesCommandManager(Component c) {
        super(c, "mines");
    }

    @Override
    public void registerCommands() {
        commands.put("create", new CommandCreate());
        commands.put("addblock", new CommandAddBlock());
        commands.put("reset", new CommandReset());
        commands.put("info", new CommandInfo());
        commands.put("list", new CommandList());
        commands.put("removeblock", new CommandRemoveBlock());
        commands.put("delete", new CommandDelete());
        commands.put("redefine", new CommandRedefine());
        commands.put("setspawn", new CommandSetSpawn());
    }
}
