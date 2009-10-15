/*
 * Copyright 2006-2009 The MZmine 2 Development Team
 *
 * This file is part of MZmine 2.
 *
 * MZmine 2 is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * MZmine 2 is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * MZmine 2; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */
package net.sf.mzmine.modules.rawdata.datasetfilters.rtcorrection;

import net.sf.mzmine.data.RawDataFile;
import net.sf.mzmine.modules.rawdata.datasetfilters.preview.RawDataFilter;
import net.sf.mzmine.util.Range;

public class RTCorrectionFilter implements RawDataFilter {

	private Range mzRange,  rtRange;

	public RTCorrectionFilter(RTCorrectionFilterParameters parameters) {
		mzRange = (Range) parameters.getParameterValue(RTCorrectionFilterParameters.mzRange);
		rtRange = (Range) parameters.getParameterValue(RTCorrectionFilterParameters.retentionTimeRange);
	}

	public RawDataFile[] getNewDataFiles(RawDataFile[] dataFile) {
		return dataFile.clone();
	}

	public double getProgres() {
		return 0.5f;
	}

	
}
