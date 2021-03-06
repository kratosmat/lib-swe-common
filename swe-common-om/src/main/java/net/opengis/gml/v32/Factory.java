/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package net.opengis.gml.v32;



public interface Factory
{
    
    
    public StringOrRef newStringOrRef();
    
    
    public TimeInstant newTimeInstant();
    
    
    public TimePeriod newTimePeriod();
    
    
    public TimePosition newTimePosition();
    
    
    public TimeIntervalLength newTimeIntervalLength();
    
    
    public Envelope newEnvelope();
    
    
    public Point newPoint();
    
    
    public LinearRing newLinearRing();


    public Polygon newPolygon();


    public LineString newLineString();
    
    
    public Reference newReference();
    
    
    public Code newCode();
    
    
    public CodeWithAuthority newCodeWithAuthority();
    
    
    public CodeList newCodeList();
    
    
    public CodeOrNilReasonList newCodeOrNilReasonList();


    public FeatureCollection newFeatureCollection();
    
}
