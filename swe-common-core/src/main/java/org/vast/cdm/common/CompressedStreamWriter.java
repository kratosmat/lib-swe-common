/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are Copyright (C) 2013 Sensia Software LLC.
 All Rights Reserved.
 
 Contributor(s): 
    Alexandre Robin <alex.robin@sensiasoftware.com>
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.cdm.common;


/**
 * <p><b>Title:</b>
 * Compressed Stream Writer
 * </p>
 *
 * <p><b>Description:</b><br/>
 * Interface for all SWE compressed block encoders
 * </p>
 *
 * <p>Copyright (c) 2013</p>
 * @author Alexandre Robin <alex.robin@sensiasoftware.com>
 * @date Sep 9, 2013
 */
public interface CompressedStreamWriter
{

    /**
     * Initializes encoder with block data component and its binary encoding info
     * @param blockComponent
     * @param binaryBlock
     * @throws CDMException
     */
    public abstract void init(DataComponent blockComponent, BinaryBlock binaryBlock) throws CDMException;
    
    
    /**
     * Writes compressed data obtained from block component to output stream
     * @param inputStream
     * @param blockComponent
     * @throws CDMException
     */
    public abstract void encode(DataOutputExt outputStream, DataComponent blockComponent) throws CDMException;
    
}
