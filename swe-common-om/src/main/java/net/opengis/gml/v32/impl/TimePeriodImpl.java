/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package net.opengis.gml.v32.impl;

import net.opengis.IDateTime;
import net.opengis.OgcProperty;
import net.opengis.OgcPropertyImpl;
import net.opengis.gml.v32.TimeInstant;
import net.opengis.gml.v32.TimeIntervalLength;
import net.opengis.gml.v32.TimePeriod;
import net.opengis.gml.v32.TimePosition;


/**
 * POJO class for XML type TimePeriodType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimePeriodImpl extends AbstractTimeGeometricPrimitiveImpl implements TimePeriod
{
    static final long serialVersionUID = 1L;
    protected TimePosition beginPosition;
    protected OgcProperty<TimeInstant> begin;
    protected TimePosition endPosition;
    protected OgcProperty<TimeInstant> end;
    protected IDateTime duration;
    protected TimeIntervalLength timeInterval;
    
    
    public TimePeriodImpl()
    {
    }
    
    
    /**
     * Gets the beginPosition property
     */
    @Override
    public TimePosition getBeginPosition()
    {
        return beginPosition;
    }
    
    
    /**
     * Checks if beginPosition is set
     */
    @Override
    public boolean isSetBeginPosition()
    {
        return (beginPosition != null);
    }
    
    
    /**
     * Sets the beginPosition property
     */
    @Override
    public void setBeginPosition(TimePosition beginPosition)
    {
        this.beginPosition = beginPosition;
    }
    
    
    /**
     * Gets the begin property
     */
    @Override
    public TimeInstant getBegin()
    {
        return begin.getValue();
    }
    
    
    /**
     * Gets extra info (name, xlink, etc.) carried by the begin property
     */
    @Override
    public OgcProperty<TimeInstant> getBeginProperty()
    {
        if (begin == null)
            begin = new OgcPropertyImpl<TimeInstant>();
        return begin;
    }
    
    
    /**
     * Checks if begin is set
     */
    @Override
    public boolean isSetBegin()
    {
        return (begin != null && begin.getValue() != null);
    }
    
    
    /**
     * Sets the begin property
     */
    @Override
    public void setBegin(TimeInstant begin)
    {
        if (this.begin == null)
            this.begin = new OgcPropertyImpl<TimeInstant>();
        this.begin.setValue(begin);
    }
    
    
    /**
     * Gets the endPosition property
     */
    @Override
    public TimePosition getEndPosition()
    {
        return endPosition;
    }
    
    
    /**
     * Checks if endPosition is set
     */
    @Override
    public boolean isSetEndPosition()
    {
        return (endPosition != null);
    }
    
    
    /**
     * Sets the endPosition property
     */
    @Override
    public void setEndPosition(TimePosition endPosition)
    {
        this.endPosition = endPosition;
    }
    
    
    /**
     * Gets the end property
     */
    @Override
    public TimeInstant getEnd()
    {
        return end.getValue();
    }
    
    
    /**
     * Gets extra info (name, xlink, etc.) carried by the end property
     */
    @Override
    public OgcProperty<TimeInstant> getEndProperty()
    {
        if (end == null)
            end = new OgcPropertyImpl<TimeInstant>();
        return end;
    }
    
    
    /**
     * Checks if end is set
     */
    @Override
    public boolean isSetEnd()
    {
        return (end != null && end.getValue() != null);
    }
    
    
    /**
     * Sets the end property
     */
    @Override
    public void setEnd(TimeInstant end)
    {
        if (this.end == null)
            this.end = new OgcPropertyImpl<TimeInstant>();
        this.end.setValue(end);
    }
    
    
    /**
     * Gets the duration property
     */
    @Override
    public IDateTime getDuration()
    {
        return duration;
    }
    
    
    /**
     * Checks if duration is set
     */
    @Override
    public boolean isSetDuration()
    {
        return (duration != null);
    }
    
    
    /**
     * Sets the duration property
     */
    @Override
    public void setDuration(IDateTime duration)
    {
        this.duration = duration;
    }
    
    
    /**
     * Gets the timeInterval property
     */
    @Override
    public TimeIntervalLength getTimeInterval()
    {
        return timeInterval;
    }
    
    
    /**
     * Checks if timeInterval is set
     */
    @Override
    public boolean isSetTimeInterval()
    {
        return (timeInterval != null);
    }
    
    
    /**
     * Sets the timeInterval property
     */
    @Override
    public void setTimeInterval(TimeIntervalLength timeInterval)
    {
        this.timeInterval = timeInterval;
    }
    
    
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof TimePeriod))
            return false;
        
        if (beginPosition != null && !beginPosition.equals(((TimePeriod)obj).getBeginPosition()))
            return false;
        
        if (endPosition != null && !endPosition.equals(((TimePeriod)obj).getEndPosition()))
            return false;
        
        if (isSetBegin() && !begin.getValue().equals(((TimePeriod)obj).getBegin()))
            return false;
        
        if (end != null && !end.getValue().equals(((TimePeriod)obj).getEnd()))
            return false;
        
        return true;
    }
}
