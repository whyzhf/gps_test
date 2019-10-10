package com.along.gps.web;

import com.along.gps.server.IntermediatePointServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class initServer implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		IntermediatePointServer intermediatePointServer=new IntermediatePointServer();
		intermediatePointServer.openNettyServer(8899);
		intermediatePointServer.openServer(8989);
		intermediatePointServer.listen();
		System.out.println("开始启动1个页面");


	}
}
