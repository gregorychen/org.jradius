/**
 * JRadius - A RADIUS Server Java Adapter
 * Copyright (C) 2004-2005 PicoPoint, B.V.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */

package net.jradius.handler;

import net.jradius.server.JRadiusRequest;

/**
 * The base abstract class of all Packet Handlers
 * 
 * @author David Bird
 * @author Gert Jan Verhoog
 */
public interface PacketHandler extends EventHandler
{
    /**
     * Derived classes must implement the handle method 
     * @param request The JRadiusRequest being processed
     * @return Returns true of the command is handled (i.e. break the chain)
     * @throws Exception
     */
    public boolean handle(JRadiusRequest request) throws Exception;
}

