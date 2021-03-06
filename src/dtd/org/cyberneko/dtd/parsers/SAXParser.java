/* 
 * (C) Copyright 2002-2003, Andy Clark.  All rights reserved.
 *
 * This file is distributed under an Apache license. Please
 * refer to the LICENSE file for specific details.
 */

package org.cyberneko.dtd.parsers;

import org.apache.xerces.parsers.AbstractSAXParser;
import org.cyberneko.dtd.DTDConfiguration;

/**
 * A SAX parser for DTD documents.
 *
 * @author Andy Clark
 *
 * @version $Id$
 */
public class SAXParser
    extends AbstractSAXParser {

    //
    // Constructors
    //

    /** Default constructor. */
    public SAXParser() {
        super(new DTDConfiguration());
    } // <init>()

} // class SAXParser
