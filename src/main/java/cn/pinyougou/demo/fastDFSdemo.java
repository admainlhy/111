package cn.pinyougou.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class fastDFSdemo {
public static void main(String[] args) {
	
	try {
		//1.加载配置文件,init中的地址就是tracker服务的地址;
		ClientGlobal.init("D:\\eclipse\\ fastDFSdemo\\src\\main\\resources\\fdfs_client.conf");
		// 2、创建一个 TrackerClient 对象。直接 new 一个。
		TrackerClient trackerClient = new TrackerClient();
		// 3、使用 TrackerClient 对象创建连接，获得一个 TrackerServer 对象
		TrackerServer trackerServer = trackerClient.getConnection();
		//4.创建一个创建一个 StorageServer 的引用，值为 null
		StorageServer  storageServer= null;
		//5.
		StorageClient storageClient = new StorageClient(trackerServer,storageServer);
		String[] files = storageClient.upload_file("C:\\Users\\Administrator\\Desktop\\itheima\\a.jpg", "jpg", null);
		
	for (String file : files) {
		System.out.println(file);
	}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
