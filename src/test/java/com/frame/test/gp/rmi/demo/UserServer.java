package com.frame.test.gp.rmi.demo;

/**
 * @author Administrator
 * @CREATE 2017/7/30 0:02
 */
public class UserServer extends User{
	public static void main(String[] args){
		UserServer userServer=new UserServer();
		userServer.setAge(18);

		User_Skeleton skeleton=new User_Skeleton(userServer);
		skeleton.start();
	}
}
