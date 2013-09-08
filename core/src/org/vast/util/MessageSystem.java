/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are subject to the Mozilla Public License Version
 1.1 (the "License"); you may not use this file except in compliance with
 the License. You may obtain a copy of the License at
 http://www.mozilla.org/MPL/MPL-1.1.html
 
 Software distributed under the License is distributed on an "AS IS" basis,
 WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 for the specific language governing rights and limitations under the License.
 
 The Original Code is the "SensorML DataProcessing Engine".
 
 The Initial Developer of the Original Code is the VAST team at the
 
 Contributor(s): 
    Alexandre Robin <robin@nsstc.uah.edu>
 
******************************* END LICENSE BLOCK ***************************/

package org.vast.util;


/**
 * <p><b>Title:</b><br/>
 * Message System
 * </p>
 *
 * <p><b>Description:</b><br/>
 * TODO MessageHandler type description
 * </p>
 *
 * <p>Copyright (c) 2005</p>
 * @author Alexandre Robin
 * @date Apr 28, 2006
 * @version 1.0
 */
public class MessageSystem
{
    private static MessageHandler displayHandler;
    private static MessageHandler logHandler;
    private static MessageHandler debugHandler;


    static
    {
        displayHandler = new DefaultMessageHandler();
        logHandler = new DefaultMessageHandler();
        debugHandler = new DefaultMessageHandler();
    }
    
    
    public static void display(String message, boolean error)
    {
        if (displayHandler != null)
            displayHandler.handleMessage(message, error);
    }
    
    
    public static void debug(String message, boolean error)
    {
        if (debugHandler != null)
            debugHandler.handleMessage(message, error);
    }
    
    
    public static void log(String message, boolean error)
    {
        if (logHandler != null)
            logHandler.handleMessage(message, error);
    }


    public static void setDisplayHandler(MessageHandler displayHandler)
    {
        MessageSystem.displayHandler = displayHandler;
    }


    public static void setLogHandler(MessageHandler logHandler)
    {
        MessageSystem.logHandler = logHandler;
    }


    public static void setDebugHandler(MessageHandler debugHandler)
    {
        MessageSystem.debugHandler = debugHandler;
    }
}