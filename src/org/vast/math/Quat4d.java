/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are subject to the Mozilla Public License Version
 1.1 (the "License"); you may not use this file except in compliance with
 the License. You may obtain a copy of the License at
 http://www.mozilla.org/MPL/MPL-1.1.html
 
 Software distributed under the License is distributed on an "AS IS" basis,
 WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 for the specific language governing rights and limitations under the License.
 
 The Original Code is the "SensorML DataProcessing Engine".
 
 The Initial Developer of the Original Code is the
 University of Alabama in Huntsville (UAH).
 Portions created by the Initial Developer are Copyright (C) 2006
 the Initial Developer. All Rights Reserved.
 
 Contributor(s): 
    Alexandre Robin <robin@nsstc.uah.edu>
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.math;


/**
 * <p><b>Title:</b><br/>
 * Quat4d
 * </p>
 *
 * <p><b>Description:</b><br/>
 * Extends from javax.vecmath.Quat4d and adds additional transformation 
 * routines.
 * </p>
 *
 * <p>Copyright (c) 2005</p>
 * @author Alexandre Robin
 * @date Nov 29, 2005
 * @version 1.0
 */
public class Quat4d extends javax.vecmath.Quat4d
{
    static final long serialVersionUID = 0;
    
    
    public Quat4d()
    {
        super();
    }


    public Quat4d(double x, double y, double z, double w)
    {
        super(x, y, z, w);
    }
    
    
    public Quat4d(Quat4d quat)
    {
        super(quat);
    }


    /**
     * Create the quaternion containing same elements as vector and q4=0
     * @param v Vector
     */
    public Quat4d(Vector3d v)
    {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
        this.w = 1.0;
    }


    /**
     * Create a quaternion with this axis and angle
     * @param v Vector Axis vector (a copy of it is normalized 1st)
     * @param angle double angle in radians
     */
    public Quat4d(Vector3d v, double angle)
    {
        Vector3d axis = v.copy();
        axis.normalize();
        this.x = axis.x * Math.sin(angle/2);
        this.y = axis.y * Math.sin(angle/2);
        this.z = axis.z * Math.sin(angle/2);
        this.w = Math.cos(angle/2);
    }


    public Quat4d copy()
    {
        return (new Quat4d(this));
    }
    
    
    public boolean isNull()
    {
        if (x == 0 && y == 0 && z == 0)
            return true;
        
        if (w == 1.0)
            return true;

        return false;
    }
}