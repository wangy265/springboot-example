package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import core.WorldClock;
import core.WorldClockService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {
	
	public static void main(String[] args) throws RemoteException {
		log.info("create World clock remote service...");
		WorldClock worldClock = new WorldClockService();
		WorldClock skeleton = (WorldClock) UnicastRemoteObject.exportObject(worldClock, 0);
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind("rmi://0.0.0.0:1099/WorldClock", skeleton);
	}
	

}
