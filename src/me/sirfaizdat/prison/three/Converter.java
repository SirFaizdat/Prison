/*
 * Prison - A plugin for the Minecraft Bukkit mod
 * Copyright (C) 2017  SirFaizdat
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

package me.sirfaizdat.prison.three;

/**
 * Represents a converter capable of converting Prison 2 Data Files to Prison 3 Data Files
 */
public interface Converter<T> {
    String convert(T object);

    void convertAndSave(T object);
}