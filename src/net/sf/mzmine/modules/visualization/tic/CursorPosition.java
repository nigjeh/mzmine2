/*
 * Copyright 2006-2008 The MZmine Development Team
 * 
 * This file is part of MZmine.
 * 
 * MZmine is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * MZmine is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General License for more details.
 * 
 * You should have received a copy of the GNU General License along with MZmine;
 * if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth
 * Floor, Boston, MA 02110-1301 USA
 */

package net.sf.mzmine.modules.visualization.tic;

import net.sf.mzmine.data.RawDataFile;

/**
 * 
 */
public class CursorPosition {

    private float retentionTime, mzValue, intensityValue;
    private RawDataFile dataFile;
    private int scanNumber;

    /**
     * @param retentionTime
     * @param mzValue
     * @param intensityValue
     * @param rawDataFile
     * @param scanNumber
     */
    public CursorPosition(float retentionTime, float mzValue, float intensityValue,
            RawDataFile dataFile, int scanNumber) {
        this.retentionTime = retentionTime;
        this.mzValue = mzValue;
        this.intensityValue = intensityValue;
        this.dataFile = dataFile;
        this.scanNumber = scanNumber;
    }

    /**
     * @return Returns the intensityValue.
     */
    public float getIntensityValue() {
        return intensityValue;
    }

    /**
     * @param intensityValue The intensityValue to set.
     */
    public void setIntensityValue(float intensityValue) {
        this.intensityValue = intensityValue;
    }

    /**
     * @return Returns the mzValue.
     */
    public float getMzValue() {
        return mzValue;
    }

    /**
     * @param mzValue The mzValue to set.
     */
    public void setMzValue(float mzValue) {
        this.mzValue = mzValue;
    }

    /**
     * @return Returns the retentionTime.
     */
    public float getRetentionTime() {
        return retentionTime;
    }

    /**
     * @param retentionTime The retentionTime to set.
     */
    public void setRetentionTime(float retentionTime) {
        this.retentionTime = retentionTime;
    }

    /**
     * @return Returns the dataFile.
     */
    public RawDataFile getDataFile() {
        return dataFile;
    }

    /**
     * @param dataFile The dataFile to set.
     */
    public void setDataFile(RawDataFile dataFile) {
        this.dataFile = dataFile;
    }

    /**
     * @return Returns the scanNumber.
     */
    public int getScanNumber() {
        return scanNumber;
    }

    /**
     * @param scanNumber The scanNumber to set.
     */
    public void setScanNumber(int scanNumber) {
        this.scanNumber = scanNumber;
    }

}
