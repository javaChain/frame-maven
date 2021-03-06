package com.frame.test.gp.rmi.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 * @CREATE 2017/7/29 23:54
 */
public class User_Skeleton extends Thread {
	private UserServer userServer;

	public User_Skeleton(UserServer userServer) {
		this.userServer = userServer;
	}


	@Override
	public void run() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(8888);
			Socket socket = serverSocket.accept();
			while (socket != null) {
				ObjectInputStream read = new ObjectInputStream(socket.getInputStream());
				String method = (String) read.readObject();

				if (method.equalsIgnoreCase("age")) {
					int age = userServer.getAge();
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
					objectOutputStream.writeInt(age);
					objectOutputStream.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null) try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
