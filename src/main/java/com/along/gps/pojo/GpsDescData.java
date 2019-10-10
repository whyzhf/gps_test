package com.along.gps.pojo;

public class GpsDescData {
	private String equip; //脚扣：123
	private String police; //警察：123
	private String prisoner;//犯人：123
	private String time;//时间：123
	private String type;//状态：越界
	private String stauts;//脚扣：正常


	//gps数据集合
	private OutboundRoadlog or;

	@Override
	public String toString() {
		return "GpsDescData{" +
				"equip='" + equip + '\'' +
				", police='" + police + '\'' +
				", prisoner='" + prisoner + '\'' +
				", time='" + time + '\'' +
				", type='" + type + '\'' +
				", stauts='" + stauts + '\'' +
				", or=" + or +
				'}';
	}

	public OutboundRoadlog getCrossGpsData() {
		return or;
	}

	public void setCrossGpsData(OutboundRoadlog or) {
		this.or = or;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	public String getPolice() {
		return police;
	}

	public void setPolice(String police) {
		this.police = police;
	}

	public String getPrisoner() {
		return prisoner;
	}

	public void setPrisoner(String prisoner) {
		this.prisoner = prisoner;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStauts() {
		return stauts;
	}

	public void setStauts(String stauts) {
		this.stauts = stauts;
	}

	public OutboundRoadlog getOr() {
		return or;
	}

	public void setOr(OutboundRoadlog or) {
		this.or = or;
	}
}
