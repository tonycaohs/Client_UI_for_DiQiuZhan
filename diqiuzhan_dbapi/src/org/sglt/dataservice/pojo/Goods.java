package org.sglt.dataservice.pojo;

public class Goods {
	
	private String _id;
	// 图片的链接地址.
	private String photoUrl;
	// 预留字段.
	private String res1;

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getRes1() {
		return res1;
	}

	public void setRes1(String res1) {
		this.res1 = res1;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}
	
}
