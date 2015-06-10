/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.bt.wiimote.extensions;

import java.awt.Point;

/**
 * 
 * <p>
 * @author <a href="mailto:vfritzsch@users.sourceforge.net">Volker Fritzsch</a>
 */
public class NunchukCalibrationData {

	private int zeroForceX;

	private int zeroForceY;

	private int zeroForceZ;

	private int gravityForceX;

	private int gravityForceY;

	private int gravityForceZ;
	
	private Point minimumAnalogPoint;
	
	private Point maximumAnalogPoint;
	
	private Point centerAnalogPoint;
	
	public NunchukCalibrationData() {
		
	}

	public int getZeroForceX() {
		return zeroForceX;
	}

	public void setZeroForceX(int zeroForceX) {
		this.zeroForceX = zeroForceX;
	}

	public int getZeroForceY() {
		return zeroForceY;
	}

	public void setZeroForceY(int zeroForceY) {
		this.zeroForceY = zeroForceY;
	}

	public int getZeroForceZ() {
		return zeroForceZ;
	}

	public void setZeroForceZ(int zeroForceZ) {
		this.zeroForceZ = zeroForceZ;
	}

	public int getGravityForceX() {
		return gravityForceX;
	}

	public void setGravityForceX(int gravityForceX) {
		this.gravityForceX = gravityForceX;
	}

	public int getGravityForceY() {
		return gravityForceY;
	}

	public void setGravityForceY(int gravityForceY) {
		this.gravityForceY = gravityForceY;
	}

	public int getGravityForceZ() {
		return gravityForceZ;
	}

	public void setGravityForceZ(int gravityForceZ) {
		this.gravityForceZ = gravityForceZ;
	}

	public Point getMinimumAnalogPoint() {
		return minimumAnalogPoint;
	}

	public void setMinimumAnalogPoint(Point minimumAnalogPoint) {
		this.minimumAnalogPoint = minimumAnalogPoint;
	}

	public Point getMaximumAnalogPoint() {
		return maximumAnalogPoint;
	}

	public void setMaximumAnalogPoint(Point maximumAnalogPoint) {
		this.maximumAnalogPoint = maximumAnalogPoint;
	}

	public Point getCenterAnalogPoint() {
		return centerAnalogPoint;
	}

	public void setCenterAnalogPoint(Point centerAnalogPoint) {
		this.centerAnalogPoint = centerAnalogPoint;
	}

}
