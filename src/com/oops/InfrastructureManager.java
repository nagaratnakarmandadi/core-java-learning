package com.oops;

import java.util.ArrayList;
import java.util.List;

// 1. INTERFACE: Defines a strict contract. Anything that is "Deployable" MUST have this method.
interface Deployable {
	void deployCode(String applicationName);
}

// 2. ABSTRACT CLASS: Base properties for all servers.
abstract class Server {
	private String ipAddress;
	private boolean isOnline;

	public Server(String ipAddress) {
		this.ipAddress = ipAddress;
		this.isOnline = false;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void bootUp() {
		isOnline = true;
		System.out.println("Server " + ipAddress + " is now ONLINE.");
	}

	// Abstract method for specific server status checks
	public abstract void checkHealth();
}

// 3. SUBCLASS implementing an Interface: A Web Server IS-A Server, and IS Deployable.
class WebServer extends Server implements Deployable {
	public WebServer(String ipAddress) {
		super(ipAddress);
	}

	@Override
	public void checkHealth() {
		System.out.println("Checking HTTP traffic for Web Server: " + getIpAddress() + " - Status: OK");
	}

	@Override
	public void deployCode(String applicationName) {
		System.out.println("🚀 Deploying '" + applicationName + "' to Web Server at " + getIpAddress());
	}
}

// 4. SUBCLASS: Database server does NOT implement Deployable, because we don't deploy web apps to it.
class DatabaseServer extends Server {
	public DatabaseServer(String ipAddress) {
		super(ipAddress);
	}

	@Override
	public void checkHealth() {
		System.out.println("Checking database connections for DB Server: " + getIpAddress() + " - Status: Stable");
	}
}

public class InfrastructureManager {
	public static void main(String[] args) {
		// Using a List (Collection) to hold our servers
		List<Server> dataCenter = new ArrayList<>();
		dataCenter.add(new WebServer("192.168.1.10"));
		dataCenter.add(new DatabaseServer("10.0.0.5"));

		System.out.println("=== Initializing Data Center ===");
		for (Server server : dataCenter) {
			server.bootUp();
			server.checkHealth();

			// Checking if the current server in the loop has the Deployable capability
			if (server instanceof Deployable) {
				// We must cast it to the interface type to use the method
				Deployable deployableServer = (Deployable) server;
				deployableServer.deployCode("E-Commerce Frontend v2.0");
			}
			System.out.println("-------------------------");
		}
	}
}