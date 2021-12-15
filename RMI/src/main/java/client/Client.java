package client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDateTime;

import core.WorldClock;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
	
	public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("0.0.0.0", 1099);
        WorldClock worldClock = (WorldClock) registry.lookup("rmi://0.0.0.0:1099/WorldClock");
        LocalDateTime now = worldClock.getLocalDateTime("Asia/Shanghai");
        log.info(now+"");
    }

}
