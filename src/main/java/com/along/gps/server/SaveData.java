package com.along.gps.server;

import com.along.gps.pojo.OutboundRoadlog;
import com.along.gps.util.ConvertData;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 数据处理
 */
public class SaveData {
	//数据包装
	public static void WarpData(String hexData){
		// gps上传数据
		if (hexData.startsWith("7E 02 00")) {
			// 检查数据有效性
			if (ConvertData.checkData(hexData)) {
				String data = ConvertData.getHexMsgToString(hexData);
				String[] strArr = data.split(";");
			} else {
				System.out.println("数据格式校验未通过...");
			}
		} else if (hexData.startsWith("7E 07 04")) {// 批量上传或是补传

		} else {
			// 不处理
		}
	}


}
