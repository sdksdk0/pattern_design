package cn.tf.pattern.prototype.shallowClone;

import java.io.Serializable;

/**
 * 探针数据 (被复杂的表)
 */

public class ProbeData implements Prototype{

	private String id;
	private String probMac;  //设备mac
	private String devcMac;  //手机mac
	private String inTime;   //进入时间
	private String outTime;  //离开时间
	private String code;     //景区id


	public ProbeData() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProbMac() {
		return probMac;
	}

	public void setProbMac(String probMac) {
		this.probMac = probMac;
	}

	public String getDevcMac() {
		return devcMac;
	}

	public void setDevcMac(String devcMac) {
		this.devcMac = devcMac;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ProbeData{" +
				"id='" + id + '\'' +
				", probMac='" + probMac + '\'' +
				", devcMac='" + devcMac + '\'' +
				", inTime='" + inTime + '\'' +
				", outTime='" + outTime + '\'' +
				", code='" + code + '\'' +
				'}';
	}

	public Prototype clone() {
		ProbeData probeData = new ProbeData();
		probeData.setDevcMac(this.devcMac);
		probeData.setProbMac(this.probMac);
		probeData.setInTime(this.inTime);
		probeData.setOutTime(this.outTime);
		return probeData;
	}
}
