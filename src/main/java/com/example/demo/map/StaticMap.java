package com.example.demo.map;

public class StaticMap {
	private int width;
	private int height;
	private double lat;
	private double lng;
	private int level;
	private String maptype;
	private String format;
	private String scale;
	private String lang;
	
	public StaticMap() { }

	@Override
	public String toString() {
		return "StaticMap [width=" + width + ", height=" + height + ", lat=" + lat + ", lng=" + lng + ", level=" + level
				+ ", maptype=" + maptype + ", format=" + format + ", scale=" + scale + ", lang=" + lang + "]";
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getMaptype() {
		return maptype;
	}

	public void setMaptype(String maptype) {
		this.maptype = maptype;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
}