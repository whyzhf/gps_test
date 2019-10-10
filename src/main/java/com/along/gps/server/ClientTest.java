/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.along.gps.server;

import com.alibaba.fastjson.JSONObject;
import com.along.gps.util.ConvertData;


import java.io.*;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Properties;


/**
 *
 * @author Administrator
 */
public class ClientTest {
	public static void write(){
		Writer w = null;
		BufferedWriter bw = null;
		long startTime = System.currentTimeMillis();
		try {
			// 写入文本
			File f = new File("D:\\qianduan\\4.txt");

			if (!f.exists()) {
				f.createNewFile();
			}
			w = new FileWriter(f, true);
			bw = new BufferedWriter(w);
			bw.write("{\"data\":{\"equip\":\"85703581676\",\"outboundRoadlog\":{\"direction\":0,\"equipmentCardId\":\"85703581676\",\"equipmentId\":4,\"form\":0,\"id\":0,\"lat\":\"北纬\",\"latitude\":22.52883,\"longitude\":113.943504,\"lot\":\"东经\",\"routeId\":0,\"speed\":0,\"taskId\":548,\"type\":0,\"uptime\":\"2019-01-01 01:52:59\"},\"police\":\"\",\"prisoner\":\"li12459 A12459\",\"stauts\":\"正常\",\"time\":\"2019-01-01 01:52:59\",\"type\":\"\"}}" + "\r\n");
			long endTime = System.currentTimeMillis();
			System.out.println("运行时间:" + (endTime - startTime) + "ms");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				w.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public static void read(){
		BufferedInputStream fis =null;
		BufferedReader reader = null;

		try {
			File file = new File("D:\\qianduan\\4.txt");
			fis = new BufferedInputStream(new FileInputStream(file));
			reader = new BufferedReader(new InputStreamReader(fis,"utf-8"),100*1024*1024);// 用5M的缓冲读取文本文件

			String line = "";
			int i=0;
			long startTime = System.currentTimeMillis();
			while((line = reader.readLine()) != null && i<1000000){
				//TODO: write your business
				JSONObject.toJSONString(line);
				i++;
				//System.out.println(i++);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("读取"+i+"条数据，运行时间:" + (endTime - startTime) + "ms");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public static void main(String args[]) {
		//write();
		read();
	/*	Properties prop = System.getProperties();

		String os = prop.getProperty("os.name");
		System.out.println(os.toLowerCase());
		if (os != null && os.toLowerCase().indexOf("linux") > -1) {

		} else {

		}*/

		/*for (int i = 0; i < 2; i++) {
			new Thread() {
				@Override
				public void run() {
					ClientTest client = new ClientTest();
					try {
						client.initClient(8899);
						client.lister();
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}



				}
			}.start();

		}*/
	//	pp();
	}


	Selector sel;

	public void initClient(int port) throws IOException {
		SocketChannel sc = SocketChannel.open();
		sc.configureBlocking(false);
		sel = Selector.open();
		boolean connect = sc.connect(new InetSocketAddress("120.77.252.208", port));
		//boolean connect = sc.connect(new InetSocketAddress("localhost", port));

		sc.register(sel, SelectionKey.OP_CONNECT);
		System.out.println("初始化客户端成功");
	}

	public void lister() throws IOException {
		while(true){
			sel.select();
			// 监听key
			Iterator<SelectionKey> keys = sel.selectedKeys().iterator();
			System.out.println(keys.hasNext());
			while (keys.hasNext()) {
				SelectionKey key = keys.next();
				// 删除已选key，防止重复处理
				keys.remove();
				// 表示请求连接的key
				if (key.isConnectable()) {
					// 请求连接
					SocketChannel sc = (SocketChannel) key.channel();
					if (sc.finishConnect()) {
						System.out.println("客户端连接成功");
						sc.configureBlocking(false);
						sc.register(sel, SelectionKey.OP_READ);
						ByteBuffer bf = ByteBuffer.allocate(1024);
						byte[] bs = new byte[] {
								(byte)0X7E,(byte)0X02,(byte)0X00,(byte)0X00,(byte)0X5C,
								(byte)0X08,(byte)0X57,(byte)0X03,(byte)0X58,(byte)0X00,(byte)0X03,
								(byte)0X00,(byte)0X00,
								(byte)0X00,(byte)0X00,(byte)0X00,(byte)0X00,
								(byte)0X80,(byte)0X0C,(byte)0X00,(byte)0X01,
								(byte)0X01,(byte)0X57,(byte)0XC1,(byte)0XE6,
								(byte)0X06,(byte)0XCA,(byte)0XA5,(byte)0XF0,
								(byte)0X00,(byte)0X00,(byte)0X00,(byte)0X00,
								(byte)0X00,(byte)0X00,(byte)0X19,(byte)0X09,
								(byte)0X21,(byte)0X16,(byte)0X59,(byte)0X15,
								(byte)0X01,(byte)0X04,(byte)0X00,(byte)0X00,
								(byte)0X00,(byte)0X0E,(byte)0X30,(byte)0X01,
								(byte)0X10,(byte)0XFE,(byte)0X35,(byte)0XE6,
								(byte)0X02,(byte)0X00,(byte)0X01,(byte)0X27,(byte)0X07,(byte)0X00,(byte)0X20,(byte)0X57,(byte)0X36,(byte)0X36,(byte)0X38,(byte)0X47,(byte)0X42,(byte)0X2D,(byte)0X56,(byte)0X31,(byte)0X2E,(byte)0X30,(byte)0X32,(byte)0X44,(byte)0X3B,(byte)0X4D,(byte)0X30,(byte)0X3A,(byte)0X31,(byte)0X3B,(byte)0X4F,(byte)0X4E,(byte)0X3A,(byte)0X32,(byte)0X36,(byte)0X2C,(byte)0X34,(byte)0X31,(byte)0X38,(byte)0X33,(byte)0X36,(byte)0X3B,(byte)0X30,(byte)0X20,(byte)0X00,(byte)0X0A,(byte)0X89,(byte)0X86,(byte)0X06,(byte)0X19,(byte)0X11,(byte)0X00,(byte)0X12,(byte)0X66,(byte)0X00,(byte)0XFF,(byte)0XED,(byte)0X7E
					};
						for (int i = 0;  ; i++) {
							System.out.println(bs.length);
							sc.write(bf.wrap(bs));
							System.out.println("客户端向服务端发送消息"+i);
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						/*System.out.println(bs.length);
						sc.write(bf.wrap(bs));
						System.out.println("客户端向服务端发送消息");*/
					}

				}
				if (key.isReadable()) {
					System.out.println("开始读取数据...");
					SocketChannel sc = (SocketChannel) key.channel();
					ByteBuffer bf = ByteBuffer.allocate(1024);
					int len;
					StringBuilder sb = new StringBuilder();
					try {
						while ((len = sc.read(bf)) > 0) {
							bf.flip();// 翻转指针
							byte[] data = bf.array();
							for (int i = 0; i < len; i++) {
								sb.append(ConvertData.byteToHex(data[i]) + " ");
							}
							bf.clear();
						}

						if (!sb.toString().trim().equals("")) {
							// 去掉前后空格;
							System.out.println(sb.toString().trim());
						}

					} catch (Exception ex) {
						ex.printStackTrace();
						key.cancel();
						sc.close();
					}

				}
			}
			break;
		}
	}
}
