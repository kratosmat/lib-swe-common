/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.data;

import net.opengis.swe.v20.DataType;


/**
 * <p>
 * Carries an array of float primitives.
 * All data is casted to other types when requested.
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * @since Nov 23, 2005
 * */
public class DataBlockFloat extends AbstractDataBlock
{
	private static final long serialVersionUID = 3467585391843199079L;
    protected float[] primitiveArray;
	
	
	public DataBlockFloat()
	{
	}
	
	
	public DataBlockFloat(int size)
	{
		resize(size);
	}
	
	
	public DataBlockFloat copy()
	{
		DataBlockFloat newBlock = new DataBlockFloat();
		newBlock.primitiveArray = this.primitiveArray;
		newBlock.startIndex = this.startIndex;
		newBlock.atomCount = this.atomCount;
		return newBlock;
	}
    
    
    public DataBlockFloat renew()
    {
        DataBlockFloat newBlock = new DataBlockFloat();
        newBlock.primitiveArray = new float[this.atomCount];
        newBlock.startIndex = this.startIndex;
        newBlock.atomCount = this.atomCount;
        return newBlock;
    }
    
    
    public DataBlockFloat clone()
    {
        DataBlockFloat newBlock = new DataBlockFloat();
        //newBlock.primitiveArray = this.primitiveArray.clone();
        newBlock.primitiveArray = new float[this.atomCount];
        System.arraycopy(this.primitiveArray, 0, newBlock.primitiveArray, 0, this.atomCount);
        newBlock.atomCount = this.atomCount;
        return newBlock;
    }
    
    
    public float[] getUnderlyingObject()
    {
        return primitiveArray;
    }
    
    
    public void setUnderlyingObject(float[] primitiveArray)
    {
        this.primitiveArray = primitiveArray;
    }
    
    
    public void setUnderlyingObject(Object obj)
    {
    	this.primitiveArray = (float[])obj;
    }
	
	
	public DataType getDataType()
	{
		return DataType.FLOAT;
	}


	public DataType getDataType(int index)
	{
		return DataType.FLOAT;
	}
	
	
	public void resize(int size)
	{
		primitiveArray = new float[size];
		this.atomCount = size;
	}


	public boolean getBooleanValue(int index)
	{
		return (primitiveArray[startIndex + index] == 0) ? false : true;
	}


	public byte getByteValue(int index)
	{
		return (byte)primitiveArray[startIndex + index];
	}


	public short getShortValue(int index)
	{
		return (short)primitiveArray[startIndex + index];
	}


	public int getIntValue(int index)
	{
		return (int)primitiveArray[startIndex + index];
	}


	public long getLongValue(int index)
	{
		return (long)primitiveArray[startIndex + index];
	}


	public float getFloatValue(int index)
	{
		return primitiveArray[startIndex + index];
	}


	public double getDoubleValue(int index)
	{
		return (double)primitiveArray[startIndex + index];
	}


	public String getStringValue(int index)
	{
		return Double.toString(primitiveArray[startIndex + index]);
	}


	public boolean getBooleanValue()
	{
		return (primitiveArray[startIndex] == 0) ? false : true;
	}


	public byte getByteValue()
	{
		return (byte)primitiveArray[startIndex];
	}


	public short getShortValue()
	{
		return (short)primitiveArray[startIndex];
	}


	public int getIntValue()
	{
		return (int)primitiveArray[startIndex];
	}


	public long getLongValue()
	{
		return (long)primitiveArray[startIndex];
	}


	public float getFloatValue()
	{
		return primitiveArray[startIndex];
	}


	public double getDoubleValue()
	{
		return (double)primitiveArray[startIndex];
	}


	public String getStringValue()
	{
		return Double.toString(primitiveArray[startIndex]);
	}


	public void setBooleanValue(int index, boolean value)
	{
		primitiveArray[startIndex + index] = value ? DataBlockBoolean.trueVal : DataBlockBoolean.falseVal;
	}


	public void setByteValue(int index, byte value)
	{
		primitiveArray[startIndex + index] = (float)value;
	}


	public void setShortValue(int index, short value)
	{
		primitiveArray[startIndex + index] = (float)value;
	}


	public void setIntValue(int index, int value)
	{
		primitiveArray[startIndex + index] = (float)value;
	}


	public void setLongValue(int index, long value)
	{
		primitiveArray[startIndex + index] = (float)value;
	}


	public void setFloatValue(int index, float value)
	{
		primitiveArray[startIndex + index] = value;
	}


	public void setDoubleValue(int index, double value)
	{
		primitiveArray[startIndex + index] = (float)value;
	}


	public void setStringValue(int index, String value)
	{
		primitiveArray[startIndex + index] = Float.parseFloat(value);
	}


	public void setBooleanValue(boolean value)
	{
		primitiveArray[startIndex] = value ? DataBlockBoolean.trueVal : DataBlockBoolean.falseVal;
	}


	public void setByteValue(byte value)
	{
		primitiveArray[startIndex] = (float)value;
	}


	public void setShortValue(short value)
	{
		primitiveArray[startIndex] = (float)value;
	}


	public void setIntValue(int value)
	{
		primitiveArray[startIndex] = (float)value;
	}


	public void setLongValue(long value)
	{
		primitiveArray[startIndex] = (float)value;
	}


	public void setFloatValue(float value)
	{
		primitiveArray[startIndex] = value;
	}


	public void setDoubleValue(double value)
	{
		primitiveArray[startIndex] = (float)value;
	}


	public void setStringValue(String value)
	{
		primitiveArray[startIndex] = Float.parseFloat(value);
	}
}
