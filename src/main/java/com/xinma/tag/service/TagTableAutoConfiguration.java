package com.xinma.tag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aliyun.openservices.ots.OTSClient;
import com.xinma.tag.service.impl.aliyun.TagTableServiceImpl;

@Configuration
@ConditionalOnClass(TagTableService.class)
@EnableConfigurationProperties(TagTableOtsProperties.class)
public class TagTableAutoConfiguration {

	@Autowired
	private TagTableOtsProperties tableOtsProperties;

	@Bean
	public TagTableService genericTagTableService() {
		TagTableService tableService = null;

		if (tableOtsProperties.isEnabled()) {
			OTSClient otsClient = new OTSClient(tableOtsProperties.getEndpoint(), tableOtsProperties.getAccessId(),
					tableOtsProperties.getAccessKey(), tableOtsProperties.getTagInstanceName());
			tableService = new TagTableServiceImpl(otsClient);
		}

		return tableService;
	}
}
