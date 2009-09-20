/*
* Copyright (C) 2009 Gilles Gigan (gilles.gigan@gmail.com)
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public  License as published by the
* Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
* or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*
*/
package avahi4j;

public class Avahi4JConstants {
	public enum Protocol {
		INET,
		INET6,
		ANY
	}
	
	/**
	 * This constant can be used when an interface number is required. It means
	 * 'use all interfaces available'.
	 */
	public static final int AnyInterface = -1;
	
	/**
	 * This method can be used to convert an error number to a string
	 * @param error the error to be converted
	 * @return a string description of the error
	 */
	public native static String getErrorString(int error);
	
	/**
	 * No error
	 */
	public static final int AVAHI_OK = 0;
	/**
	 * Generic error code
	 */
	public static final int AVAHI_ERR_FAILURE = -1;
	/**
	 * Object was in a bad state
	 */
	public static final int AVAHI_ERR_BAD_STATE = -2;
	/**
	 * Invalid host name
	 */
	public static final int AVAHI_ERR_INVALID_HOST_NAME = -3;
	/**
	 * Invalid domain name
	 */
	public static final int AVAHI_ERR_INVALID_DOMAIN_NAME = -4;
	/**
	 * No suitable network protocol available
	 */
	public static final int AVAHI_ERR_NO_NETWORK = -5;
	/**
	 * Invalid DNS TTL
	 */
	public static final int AVAHI_ERR_INVALID_TTL = -6;
	/**
	 * RR key is pattern
	 */
	public static final int AVAHI_ERR_IS_PATTERN = -7;
	/**
	 * Name collision
	 */
	public static final int AVAHI_ERR_COLLISION = -8;
	/**
	 * Invalid RR
	 */
	public static final int AVAHI_ERR_INVALID_RECORD = -9;
	/**
	 * Invalid service name
	 */
	public static final int AVAHI_ERR_INVALID_SERVICE_NAME = -10;
	/**
	 * Invalid service type
	 */
	public static final int AVAHI_ERR_INVALID_SERVICE_TYPE = -11;
	/**
	 * Invalid port number
	 */
	public static final int AVAHI_ERR_INVALID_PORT = -12;
	/**
	 * Invalid key
	 */
	public static final int AVAHI_ERR_INVALID_KEY = -13;
	/**
	 * Invalid address
	 */
	public static final int AVAHI_ERR_INVALID_ADDRESS = -14;
	/**
	 * Timeout reached
	 */
	public static final int AVAHI_ERR_TIMEOUT = -15;
	/**
	 * Too many clients
	 */
	public static final int AVAHI_ERR_TOO_MANY_CLIENTS = -16;
	/**
	 * Too many objects
	 */
	public static final int AVAHI_ERR_TOO_MANY_OBJECTS = -17;
	/**
	 * Too many entries
	 */
	public static final int AVAHI_ERR_TOO_MANY_ENTRIES = -18;
	/**
	 * OS error
	 */
	public static final int AVAHI_ERR_OS = -19;
	/**
	 * Access denied
	 */
	public static final int AVAHI_ERR_ACCESS_DENIED = -20;
	/**
	 * Invalid operation
	 */
	public static final int AVAHI_ERR_INVALID_OPERATION = -21;
	/**
	 * unexpected DBUS error
	 */
	public static final int AVAHI_ERR_DBUS_ERROR = -22;
	/**
	 * Daemon connection failed
	 */
	public static final int AVAHI_ERR_DISCONNECTED = -23;
	/**
	 * Memory exhausted
	 */
	public static final int AVAHI_ERR_NO_MEMORY = -24;
	/**
	 * The object given to a function is not valid
	 */
	public static final int AVAHI_ERR_INVALID_OBJECT = -25;
	/**
	 * Daemon not running
	 */
	public static final int AVAHI_ERR_NO_DAEMON = -26;
	/**
	 * Invalid interface
	 */
	public static final int AVAHI_ERR_INVALID_INTERFACE = -27;
	/**
	 * Invalid protocol
	 */
	public static final int AVAHI_ERR_INVALID_PROTOCOL = -28;
	/**
	 * Invalid flags
	 */
	public static final int AVAHI_ERR_INVALID_FLAGS = -29;
	/**
	 * Not found
	 */
	public static final int AVAHI_ERR_NOT_FOUND = -30;
	/**
	 * Configuration error
	 */
	public static final int AVAHI_ERR_INVALID_CONFIG = -31;
	/**
	 * Version mismatch
	 */
	public static final int AVAHI_ERR_VERSION_MISMATCH = -32;
	/**
	 * Invalid service subtype
	 */
	public static final int AVAHI_ERR_INVALID_SERVICE_SUBTYPE = -33;
	/**
	 * Invalid packet
	 */
	public static final int AVAHI_ERR_INVALID_PACKET = -34;
	/**
	 * Invalid DNS return code
	 */
	public static final int AVAHI_ERR_INVALID_DNS_ERROR = -35;
	/**
	 * DNS error: form error
	 */
	public static final int AVAHI_ERR_DNS_FORMERR = -36;
	/**
	 * DNS error: server failure
	 */
	public static final int AVAHI_ERR_DNS_SERVFAIL = -37;
	/**
	 * DNS error: no such domain
	 */
	public static final int AVAHI_ERR_DNS_NXDOMAIN = -38;
	/**
	 * DNS error: not implemented
	 */
	public static final int AVAHI_ERR_DNS_NOTIMP = -39;
	/**
	 * DNS error: operation refused
	 */
	public static final int AVAHI_ERR_DNS_REFUSED = -40;
	/**
	 * TODO: complete me
	 */
	public static final int AVAHI_ERR_DNS_YXDOMAIN = -41;
	/**
	 * TODO: complete me
	 */
	public static final int AVAHI_ERR_DNS_YXRRSET = -42;
	/**
	 * TODO: complete me
	 */
	public static final int AVAHI_ERR_DNS_NXRRSET = -43;
	/**
	 * DNS error: not authorised
	 */
	public static final int AVAHI_ERR_DNS_NOTAUTH = -44;
	/**
	 * TODO: complete me
	 */
	public static final int AVAHI_ERR_DNS_NOTZONE = -45;
	/**
	 * Invalid RDATA
	 */
	public static final int AVAHI_ERR_INVALID_RDATA = -46;
	/**
	 * Invalid DNS class
	 */
	public static final int AVAHI_ERR_INVALID_DNS_CLASS = -47;
	/**
	 * Invalid DNS type
	 */
	public static final int AVAHI_ERR_INVALID_DNS_TYPE = -48;
	/**
	 * Not supported
	 */
	public static final int AVAHI_ERR_NOT_SUPPORTED = -49;
	/**
	 * Operation not permitted
	 */
	public static final int AVAHI_ERR_NOT_PERMITTED = -50;
	/**
	 * Invalid argument
	 */
	public static final int AVAHI_ERR_INVALID_ARGUMENT = -51;
	/**
	 * Is empty
	 */
	public static final int AVAHI_ERR_IS_EMPTY = -52;
	/**
	 * The requested operation is invalid because it is redundant
	 */
	public static final int AVAHI_ERR_NO_CHANGE = -53; 
}
