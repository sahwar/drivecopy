/**
 * Copyright 2012 Luca Zanconato
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.nharyes.drivecopy.log;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class TinyFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		
		// set level char
		char c = '?';
		if (record.getLevel().equals(Level.INFO))
			c = '-';
		else if (record.getLevel().equals(Level.FINE))
			c = '#';
		else if (record.getLevel().equals(Level.WARNING))
			c = '*';
		else if (record.getLevel().equals(Level.SEVERE))
			c = '!';
		
		// return message
		return String.format("%1$s%1$s %2$s\n", c, record.getMessage());
	}
}
