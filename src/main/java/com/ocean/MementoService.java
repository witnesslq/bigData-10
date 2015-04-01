package com.ocean;

import java.rmi.server.RemoteServer;
import java.rmi.server.ServerNotActiveException;

import com.ocean.util.LogUtil;

class MementoService {
	String getClientHost() {
		String clienthost = null;
		try {
			clienthost = RemoteServer.getClientHost();
		} catch (ServerNotActiveException ex) {
			LogUtil.fine("[MementoService]", "[getClientHost]", ex);
		}
		// System.out.println("clienthost:"+clienthost);
		return clienthost;
	}
}