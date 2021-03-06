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

import net.opengis.swe.v20.XMLEncoding;


/**
 * POJO class for XML type JSONEncodingType(@http://www.opengis.net/swe/2.0).
 *
 * This is a complex type.
 */
public class JSONEncodingImpl extends AbstractEncodingImpl implements XMLEncoding
{
    static final long serialVersionUID = 1L;
    boolean pretty;
    
    
    public JSONEncodingImpl()
    {        
    }
    
    
    public JSONEncodingImpl(boolean pretty)
    {
        this.pretty = pretty;
    }
    
    
    @Override
    public JSONEncodingImpl copy()
    {
        JSONEncodingImpl newObj = new JSONEncodingImpl(pretty);
        return newObj;
    }


    public boolean isPretty()
    {
        return pretty;
    }


    public void setPretty(boolean pretty)
    {
        this.pretty = pretty;
    }
}
