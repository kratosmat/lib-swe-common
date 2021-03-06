/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are subject to the Mozilla Public License Version
 1.1 (the "License"); you may not use this file except in compliance with
 the License. You may obtain a copy of the License at
 http://www.mozilla.org/MPL/MPL-1.1.html
 
 Software distributed under the License is distributed on an "AS IS" basis,
 WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 for the specific language governing rights and limitations under the License.
 
 The Initial Developer of the Original Code is Sensia Software LLC.
 Portions created by the Initial Developer are Copyright (C) 2014
 the Initial Developer. All Rights Reserved.

 Please Contact Alexandre Robin <alex.robin@sensiasoftware.com> or 
 Mike Botts <mike.botts@botts-inc.net for more information.
 
 Contributor(s): 
    Alexandre Robin <alex.robin@sensiasoftware.com>
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.ogc.gml;

import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;


/**
 * <p>
 * Basic interface for a feature object
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * @since Sep 28, 2012
 * */
public interface IFeature
{
    public QName getQName();
    
    public String getType();
    
    public void setType(String type);

    public String getLocalId();
    
    public void setLocalId(String id);
    
    public String getIdentifier();
    
    public void setIdentifier(String uid);
    
    public String getDescription();
    
    public void setDescription(String desc);
    
    public String getName();
    
    public void setName(String name);
    
    public List<QName> getNames();
    
    public void addName(QName name);
    
    public Map<QName, Object> getProperties();
    
    public Object getProperty(String name);
    
    public void setProperty(String name, Object value);
    
    public Object getProperty(QName qname);
    
    public void setProperty(QName qname, Object value);
}
