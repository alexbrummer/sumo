/****************************************************************************/
// Eclipse SUMO, Simulation of Urban MObility; see https://eclipse.org/sumo
// Copyright (C) 2016-2019 German Aerospace Center (DLR) and others.
// This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v2.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v20.html
// SPDX-License-Identifier: EPL-2.0
/****************************************************************************/
/// @file    Constants.java
/// @author  Maximiliano Bottazzi
/// @date    2016
/// @version $Id$
///
//
/****************************************************************************/
package de.dlr.ts.lisum.gui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author @author <a href="mailto:maximiliano.bottazzi@dlr.de">Maximiliano Bottazzi</a>
 */
public final class Icons
{
    private static final Icons INSTANCE = new Icons();
    
    /**
     * 
     * @return 
     */
    public static Icons getInstance()
    {
        return INSTANCE;
    }
    
    /**
     * 
     */
    public Icons()
    {
    }
    
    /**
     * 
     * @param name
     * @param size
     * @return 
     */
    public Image getIconImage(String name, int size)
    {
        String _size;
        
        if(size == 16)
            _size = "16x16";
        else
            _size = "24x24";
        
        return new Image(getClass().getResourceAsStream("/images/icons/" + _size + "/" + name + ".png"));
    }
    
    /**
     * 
     */
    public void init()
    {
        
    }
    
    /**
     * 
     * @param name
     * @param size
     * @return 
     */
    public ImageView getIconImageView(String name, int size)
    {
        return new ImageView(getIconImage(name, size));
    }
    
    /**
     * 
     * @param name
     * @param size
     * @param z
     * @return 
     */
    public ImageView getIconImageView(String name, int size, int z )
    {
        ImageView iv = new ImageView(getIconImage(name, size));
        iv.setEffect(null);
        
        return new ImageView(getIconImage(name, size));
    }
    
    /**
     * 
     * @param name 
     * @return  
     */
    public Image getMarkerImage(String name)
    {
        return new Image(getClass().getResourceAsStream("/images/markers/" + name + ".png"));
    }
    
    
    /**
     * 
     * @param name
     * @return 
     */
    public ImageView getMarkerImageView(String name)
    {
        return new ImageView(getMarkerImage(name));
    }
    
}
