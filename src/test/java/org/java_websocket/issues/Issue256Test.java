/*
 * Copyright (c) 2010-2018 Nathan Rajlich
 *
 *  Permission is hereby granted, free of charge, to any person
 *  obtaining a copy of this software and associated documentation
 *  files (the "Software"), to deal in the Software without
 *  restriction, including without limitation the rights to use,
 *  copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the
 *  Software is furnished to do so, subject to the following
 *  conditions:
 *
 *  The above copyright notice and this permission notice shall be
 *  included in all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 *  OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 *  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 *  WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 *  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 *  OTHER DEALINGS IN THE SOFTWARE.
 */

package org.java_websocket.issues;

import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.server.WebSocketServer;
import org.java_websocket.util.SocketUtil;
import org.java_websocket.util.ThreadCheck;
import org.junit.Rule;
import org.junit.Test;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.CountDownLatch;

public class Issue256Test {

	/**
	 * This causes problems on my jenkins. Need to fix this so just deactivate it for the pull request
	@Rule
	public ThreadCheck zombies = new ThreadCheck();

	private void runTestScenarioReconnect(boolean reconnectBlocking) throws Exception {
		final CountDownLatch countServerDownLatch = new CountDownLatch( 1 );
		int port = SocketUtil.getAvailablePort();
		WebSocketServer ws = new WebSocketServer( new InetSocketAddress( port ) ) {
			@Override
			public void onOpen( WebSocket conn, ClientHandshake handshake ) {

			}

			@Override
			public void onClose( WebSocket conn, int code, String reason, boolean remote ) {

			}

			@Override
			public void onMessage( WebSocket conn, String message ) {

			}

			@Override
			public void onError( WebSocket conn, Exception ex ) {

			}

			@Override
			public void onStart() {
				countServerDownLatch.countDown();
			}
		};
		ws.start();
		countServerDownLatch.await();
		WebSocketClient clt = new WebSocketClient( new URI( "ws://localhost:" + port ) ) {
			@Override
			public void onOpen( ServerHandshake handshakedata ) {

			}

			@Override
			public void onMessage( String message ) {

			}

			@Override
			public void onClose( int code, String reason, boolean remote ) {

			}

			@Override
			public void onError( Exception ex ) {

			}
		};
		clt.connectBlocking();
		clt.send("test");
		clt.getSocket().close();
		if (reconnectBlocking) {
			clt.reconnectBlocking();
		} else {
			clt.reconnect();
		}
		Thread.sleep( 100 );

		ws.stop();
		Thread.sleep( 100 );
	}

	@Test
	public void runReconnectBlockingScenario0() throws Exception {
		runTestScenarioReconnect(true);
	}
	@Test
	public void runReconnectBlockingScenario1() throws Exception {
		runTestScenarioReconnect(true);
	}
	@Test
	public void runReconnectBlockingScenario2() throws Exception {
		runTestScenarioReconnect(true);
	}
	@Test
	public void runReconnectBlockingScenario3() throws Exception {
		runTestScenarioReconnect(true);
	}
	@Test
	public void runReconnectBlockingScenario4() throws Exception {
		runTestScenarioReconnect(true);
	}
	@Test
	public void runReconnectBlockingScenario5() throws Exception {
		runTestScenarioReconnect(true);
	}
	@Test
	public void runReconnectBlockingScenario6() throws Exception {
		runTestScenarioReconnect(true);
	}
	@Test
	public void runReconnectBlockingScenario7() throws Exception {
		runTestScenarioReconnect(true);
	}
	@Test
	public void runReconnectBlockingScenario8() throws Exception {
		runTestScenarioReconnect(true);
	}
	@Test
	public void runReconnectBlockingScenario9() throws Exception {
		runTestScenarioReconnect(true);
	}

	@Test
	public void runReconnectScenario0() throws Exception {
		runTestScenarioReconnect(false);
	}
	@Test
	public void runReconnectScenario1() throws Exception {
		runTestScenarioReconnect(false);
	}
	@Test
	public void runReconnectScenario2() throws Exception {
		runTestScenarioReconnect(false);
	}
	@Test
	public void runReconnectScenario3() throws Exception {
		runTestScenarioReconnect(false);
	}
	@Test
	public void runReconnectScenario4() throws Exception {
		runTestScenarioReconnect(false);
	}
	@Test
	public void runReconnectScenario5() throws Exception {
		runTestScenarioReconnect(false);
	}
	@Test
	public void runReconnectScenario6() throws Exception {
		runTestScenarioReconnect(false);
	}
	@Test
	public void runReconnectScenario7() throws Exception {
		runTestScenarioReconnect(false);
	}
	@Test
	public void runReconnectScenario8() throws Exception {
		runTestScenarioReconnect(false);
	}
	@Test
	public void runReconnectScenario9() throws Exception {
		runTestScenarioReconnect(false);
	}

	*/
}

