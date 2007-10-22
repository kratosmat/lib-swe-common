/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are subject to the Mozilla Public License Version
 1.1 (the "License"); you may not use this file except in compliance with
 the License. You may obtain a copy of the License at
 http://www.mozilla.org/MPL/MPL-1.1.html
 
 Software distributed under the License is distributed on an "AS IS" basis,
 WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 for the specific language governing rights and limitations under the License.
 
 The Original Code is the "SensorML DataProcessing Engine".
 
 The Initial Developer of the Original Code is the VAST team at the University of Alabama in Huntsville (UAH). <http://vast.uah.edu> Portions created by the Initial Developer are Copyright (C) 2007 the Initial Developer. All Rights Reserved. Please Contact Mike Botts <mike.botts@uah.edu> for more information.
 
 Contributor(s): 
    Alexandre Robin <robin@nsstc.uah.edu>
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.cdm.common;

import java.io.OutputStream;


/**
 * <p><b>Title:</b><br/>
 * Data Description XML Writer
 * </p>
 *
 * <p><b>Description:</b><br/>
 * Concrete implementations of this interface are responsible for
 * using specified encoding info and data components to write the
 * XML document containing these descriptions to the output stream.
 * </p>
 *
 * <p>Copyright (c) 2007</p>
 * @author Alexandre Robin
 * @since Aug 12, 2005
 * @version 1.0
 */
public interface DataDescriptionWriter
{
    public DataComponent getDataComponents();
    
    
    public DataEncoding getDataEncoding();
    
    
    public DataStreamWriter getDataWriter() throws CDMException;
    
    
    public void setDataComponents(DataComponent dataComponents);
	
	
	public void setDataEncoding(DataEncoding dataEncoding);
	
	
    public void write(OutputStream outputStream) throws CDMException;
}
