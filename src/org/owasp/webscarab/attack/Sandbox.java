/* 
 * Copyright (c) 2002 owasp.org.
 * This file is part of WebScarab.
 * WebScarab is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * WebScarab is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * The valid license text for this file can be retrieved with
 * the call:   java -cp owasp.jar org.owasp.webscarab.LICENSE
 * 
 * If you are not able to view the LICENSE that way, which should
 * always be possible within a valid and working WebScarab release,
 * please write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.owasp.webscarab.attack;

import org.owasp.webscarab.data.Portal;
import org.owasp.webscarab.data.DbListener;
import org.owasp.webscarab.data.Queue;

/** 
 * TODO: Description
 * 
 * @since 0.poc
 * @version 0.poc<br />CVS $Release$ $Author: istr $
 * @author <a href="mailto:ingo@ingostruck.de">ingo@ingostruck.de</a>
 */
public final class Sandbox 
	implements Runnable, DbListener 
{
	private Thread _thread;
	private final Portal _portal;
	
	public Sandbox ( Portal portal ) {
		if ( null == portal )
			throw new IllegalArgumentException( "must provide a portal" );
		_portal = portal;
		_thread = null;
	}

	// java.lang.Runnable impl.
	public void run () {
		_thread = Thread.currentThread();
	}

	// org.owasp.webscarab.data.DbListener impl.
	public String getId () {
		return "Sandbox";
	}

	public void notify ( int id ) {}

	public Queue getQueue () {
		return null;
	}
} // class Sandbox
