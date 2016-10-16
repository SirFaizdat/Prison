/*
 * Prison - A plugin for the Minecraft Bukkit mod
 * Copyright (C) 2016  SirFaizdat
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package me.sirfaizdat.prison.ranks.events;

import me.sirfaizdat.prison.ranks.Rank;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author SirFaizdat
 */
public class RankAddedEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private Rank newRank;

    public RankAddedEvent(Rank newRank) {
        this.newRank = newRank;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Rank getRank() {
        return newRank;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}
