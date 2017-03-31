package com.xinma.tag.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "aliyun.ots")
public class TagTableOtsProperties {

	private boolean enabled;

	private String endpoint;

	private String accessId;

	private String accessKey;

	private String tagInstanceName;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getTagInstanceName() {
		return tagInstanceName;
	}

	public void setTagInstanceName(String tagInstanceName) {
		this.tagInstanceName = tagInstanceName;
	}

}
