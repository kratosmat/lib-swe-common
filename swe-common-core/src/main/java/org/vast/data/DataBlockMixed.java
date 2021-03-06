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

import net.opengis.swe.v20.DataBlock;
import net.opengis.swe.v20.DataType;


/**
 * <p>
 * Uses the composite pattern to carry a fixed size array
 * of mixed types DataBlocks. If dynamic size is needed, use DataBlockList.
 * Children datablocks will be read sequentially.
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * */
public class DataBlockMixed extends AbstractDataBlock
{
	private static final long serialVersionUID = 2573107762518456783L;
    protected AbstractDataBlock[] blockArray;
	protected int blockIndex;
	protected int localIndex;
    //protected int lastBlockIndex, lastIndex, lastCumulIndex;


	public DataBlockMixed()
	{
	}


	public DataBlockMixed(int numBlocks)
	{
		blockArray = new AbstractDataBlock[numBlocks];
	}
	
	
	public DataBlockMixed(int numBlocks, int atomCount)
	{
		blockArray = new AbstractDataBlock[numBlocks];
		this.atomCount = atomCount;
	}
	
	
	public DataBlockMixed(AbstractDataBlock... childBlocks)
    {
        blockArray = childBlocks;
        for (DataBlock dataBlock: childBlocks)
            this.atomCount += dataBlock.getAtomCount();
    }
	
	
	public DataBlockMixed copy()
	{
		DataBlockMixed newBlock = new DataBlockMixed();
		newBlock.startIndex = this.startIndex;
		newBlock.blockArray = this.blockArray;	
		newBlock.atomCount = this.atomCount;
		return newBlock;
	}
    
    
    public DataBlockMixed renew()
    {
        DataBlockMixed newBlock = new DataBlockMixed();
        newBlock.startIndex = this.startIndex;
        newBlock.blockArray = new AbstractDataBlock[blockArray.length];
        
        // renew all blocks in the array
        for (int i=0; i<blockArray.length; i++)
        {
            if (this.blockArray[i] != null)
                newBlock.blockArray[i] = this.blockArray[i].renew();
        }
        
        newBlock.atomCount = this.atomCount;
        return newBlock;
    }
    
    
    public DataBlockMixed clone()
    {
        DataBlockMixed newBlock = new DataBlockMixed();
        newBlock.startIndex = this.startIndex;
        newBlock.blockArray = new AbstractDataBlock[blockArray.length];
        
        // fully copy (clone) all blocks in the array
        for (int i=0; i<blockArray.length; i++)
        {
            if (this.blockArray[i] != null)
                newBlock.blockArray[i] = this.blockArray[i].clone();
        }
        
        newBlock.atomCount = this.atomCount;
        return newBlock;
    }
    
    
    public AbstractDataBlock[] getUnderlyingObject()
    {
        return blockArray;
    }
    
    
    public void setUnderlyingObject(AbstractDataBlock[] blockArray)
    {
        this.blockArray = blockArray;
    }
    
    
    public void setUnderlyingObject(Object obj)
    {
    	this.blockArray = (AbstractDataBlock[])obj;
    }
	
	
	public DataType getDataType()
	{
		return DataType.MIXED;
	}


	public DataType getDataType(int index)
	{
		selectBlock(index);
		return blockArray[blockIndex].getDataType();
	}


	public void resize(int size)
	{
		// don't know what to do here !!
	}
	
	
	protected void selectBlock(int index)
	{
        int i = 0;
        int cumul = 0;
        int size;
        int desiredIndex = startIndex + index;
        
        do
        {
            size = blockArray[i].atomCount;
            cumul += size;
            i++;
        }
        while (desiredIndex >= cumul);

        blockIndex = i - 1;
        localIndex = desiredIndex - (cumul - size);
        
//		int i, size, cumul;
//		int desiredIndex = startIndex + index;
//		
//        if (index > lastIndex)
//        {
//            i = lastBlockIndex;
//            cumul = lastCumulIndex;
//        }
//        else
//        {
//            i = 0;
//            cumul = 0;
//        }
//            
//		do
//		{
//			size = blockArray[i].atomCount;
//			cumul += size;
//			i++;
//		}
//		while (desiredIndex >= cumul);
//
//		blockIndex = i - 1;
//        lastCumulIndex = cumul - size;
//		localIndex = desiredIndex - lastCumulIndex;
//        
//        lastIndex = index;
//        lastBlockIndex = blockIndex;
//        lastCumulIndex = cumul - size;
	}


	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append(super.toString());
		buffer.append(": ");
		buffer.append('[');

		if (atomCount > 0)
		{
			selectBlock(0);
			int start = blockIndex;
			selectBlock(getAtomCount() - 1);
			int stop = blockIndex + 1;
			
			for (int i = start; i < stop; i++)
			{
				buffer.append(blockArray[i].toString());
				if (i < stop - 1)
					buffer.append(',');
			}
		}
		
		buffer.append(']');
		return buffer.toString();
	}


	public boolean getBooleanValue(int index)
	{
		selectBlock(index);
		return blockArray[blockIndex].getBooleanValue(localIndex);
	}


	public byte getByteValue(int index)
	{
		selectBlock(index);
		return blockArray[blockIndex].getByteValue(localIndex);
	}


	public short getShortValue(int index)
	{
		selectBlock(index);
		return blockArray[blockIndex].getShortValue(localIndex);
	}


	public int getIntValue(int index)
	{
		selectBlock(index);
		return blockArray[blockIndex].getIntValue(localIndex);
	}


	public long getLongValue(int index)
	{
		selectBlock(index);
		return blockArray[blockIndex].getLongValue(localIndex);
	}


	public float getFloatValue(int index)
	{
		selectBlock(index);
		return blockArray[blockIndex].getFloatValue(localIndex);
	}


	public double getDoubleValue(int index)
	{
		selectBlock(index);
        //System.out.println(blockIndex + " " + localIndex);
		return blockArray[blockIndex].getDoubleValue(localIndex);
	}


	public String getStringValue(int index)
	{
		selectBlock(index);
		return blockArray[blockIndex].getStringValue(localIndex);
	}


	public boolean getBooleanValue()
	{
		selectBlock(0);
		return blockArray[blockIndex].getBooleanValue(localIndex);
	}


	public byte getByteValue()
	{
		selectBlock(0);
		return blockArray[blockIndex].getByteValue(localIndex);
	}


	public short getShortValue()
	{
		selectBlock(0);
		return blockArray[blockIndex].getShortValue(localIndex);
	}


	public int getIntValue()
	{
		selectBlock(0);
		return blockArray[blockIndex].getIntValue(localIndex);
	}


	public long getLongValue()
	{
		selectBlock(0);
		return blockArray[blockIndex].getLongValue(localIndex);
	}


	public float getFloatValue()
	{
		selectBlock(0);
		return blockArray[blockIndex].getFloatValue(localIndex);
	}


	public double getDoubleValue()
	{
		selectBlock(0);
		return blockArray[blockIndex].getDoubleValue(localIndex);
	}


	public String getStringValue()
	{
		selectBlock(0);
		return blockArray[blockIndex].getStringValue(localIndex);
	}

	public void setBlock(int blockIndex, AbstractDataBlock Block)
	{
		blockArray[blockIndex] = Block;
	}
	
	
	public void setBooleanValue(int index, boolean value)
	{
		selectBlock(index);
		blockArray[blockIndex].setBooleanValue(localIndex, value);
	}


	public void setByteValue(int index, byte value)
	{
		selectBlock(index);
		blockArray[blockIndex].setByteValue(localIndex, value);
	}


	public void setShortValue(int index, short value)
	{
		selectBlock(index);
		blockArray[blockIndex].setShortValue(localIndex, value);
	}


	public void setIntValue(int index, int value)
	{
		selectBlock(index);
		blockArray[blockIndex].setIntValue(localIndex, value);
	}


	public void setLongValue(int index, long value)
	{
		selectBlock(index);
		blockArray[blockIndex].setLongValue(localIndex, value);
	}


	public void setFloatValue(int index, float value)
	{
		selectBlock(index);
		blockArray[blockIndex].setFloatValue(localIndex, value);
	}


	public void setDoubleValue(int index, double value)
	{
		selectBlock(index);
		blockArray[blockIndex].setDoubleValue(localIndex, value);
	}


	public void setStringValue(int index, String value)
	{
		selectBlock(index);
		blockArray[blockIndex].setStringValue(localIndex, value);
	}


	public void setBooleanValue(boolean value)
	{
		selectBlock(0);
		blockArray[blockIndex].setBooleanValue(localIndex, value);
	}


	public void setByteValue(byte value)
	{
		selectBlock(0);
		blockArray[blockIndex].setByteValue(localIndex, value);
	}


	public void setShortValue(short value)
	{
		selectBlock(0);
		blockArray[blockIndex].setShortValue(localIndex, value);
	}


	public void setIntValue(int value)
	{
		selectBlock(0);
		blockArray[blockIndex].setIntValue(localIndex, value);
	}


	public void setLongValue(long value)
	{
		selectBlock(0);
		blockArray[blockIndex].setLongValue(localIndex, value);
	}


	public void setFloatValue(float value)
	{
		selectBlock(0);
		blockArray[blockIndex].setFloatValue(localIndex, value);
	}


	public void setDoubleValue(double value)
	{
		selectBlock(0);
		blockArray[blockIndex].setDoubleValue(localIndex, value);
	}


	public void setStringValue(String value)
	{
		selectBlock(0);
		blockArray[blockIndex].setStringValue(localIndex, value);
	}
}
