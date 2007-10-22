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

import org.vast.xml.DOMHelper;
import org.w3c.dom.*;


/**
 * <p><b>Title:</b><br/>
 * Data Components XML Reader
 * </p>
 *
 * <p><b>Description:</b><br/>
 * Concrete implementations of this interface are responsible for
 * parsing an XML element containing data components description
 * as specified in the schema and create the appropriate DataComponents
 * object.  
 * </p>
 *
 * <p>Copyright (c) 2007</p>
 * @author Alexandre Robin
 * @since Aug 12, 2005
 * @version 1.0
 */
public interface DataComponentReader
{
    
    /**
     * Reads contents of any data component (record/array/scalar)
     * @param dom
     * @param dataComponentElement
     * @return
     * @throws CDMException
     */
    public DataComponent readComponent(DOMHelper dom, Element componentElement) throws CDMException;
    
    
    /**
     * Reads a component property in a data component
     * @param dom
     * @param propertyElement
     * @return
     * @throws CDMException
     */
    public DataComponent readComponentProperty(DOMHelper dom, Element propertyElement) throws CDMException;
}
