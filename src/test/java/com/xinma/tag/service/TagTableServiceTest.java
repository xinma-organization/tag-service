package com.xinma.tag.service;

import java.math.BigInteger;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xinma.base.tag.CloudTag;
import com.xinma.base.tag.TagBuilder;
import com.xinma.base.tag.TagConstants;
import com.xinma.tag.model.TagBasicInfoEO;
import com.xinma.tag.service.impl.aliyun.TagTableServiceImpl;

public class TagTableServiceTest extends TagServiceBaseTest {

	private TagTableService tagTableService;

	@BeforeClass
	public void init() {
		tagTableService = new TagTableServiceImpl(otsClient);
	}

	@Test
	public void addLotteryEnrolled() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void addTagAccessLog() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void addTagAward() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void getTagAccessLogs() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void getTagAwards() {
		// throw new RuntimeException("Test not implemented");
	}

	@Ignore
	@Test
	public void getTagBasicInfo() throws JsonProcessingException {
		TagBasicInfoEO tagBasicInfo = tagTableService.getTagBasicInfo(1010167820);
		System.out.println(new ObjectMapper().writeValueAsString(tagBasicInfo));
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void getTagLotteryEnrolled() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void getTagRow() {
		// throw new RuntimeException("Test not implemented");
	}

	@Ignore
	public void putOrUpdateTagBasicInfo() {

		TagBasicInfoEO tagBasicInfo = new TagBasicInfoEO();
		tagBasicInfo.setOrganizationId(1);
		tagBasicInfo.setProductId(1);
		tagBasicInfo.setFactoryId(1);
		tagBasicInfo.setProduceTime(new Date());

		BigInteger startUniqueCode = BigInteger.valueOf(1010167820);
		long tagCount = 100;
		TagBuilder builder = new TagBuilder(TagConstants.CODE_VERSION_1, startUniqueCode, tagCount);

		CloudTag cloudTag = builder.nextCloudTag();
		while (cloudTag != null) {
			System.out.println(cloudTag.getHiddenCode());
			tagBasicInfo.setMeta(cloudTag);
			tagTableService.putOrUpdateTagBasicInfo(tagBasicInfo);

			cloudTag = builder.nextCloudTag();
		}
	}
}
