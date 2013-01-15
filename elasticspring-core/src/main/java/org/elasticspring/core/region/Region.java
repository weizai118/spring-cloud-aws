/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elasticspring.core.region;

public enum Region {
	US_EAST_1("us-east-1", "amazonaws.com"),
	US_WEST_1("us-west-1", "amazonaws.com"),
	US_WEST_2("us-west-2", "amazonaws.com"),
	EU_WEST_1("eu-west-1", "amazonaws.com"),
	AP_SOUTHEAST_1("ap-southeast-1", "amazonaws.com"),
	AP_SOUTHEAST_2("ap-southeast-2", "amazonaws.com"),
	AP_NORTHEAST_1("ap-northeast-1", "amazonaws.com"),
	SA_EAST_1("sa-east-1", "amazonaws.com");

	private final String region;
	private final String domain;

	Region(String region, String domain) {
		this.region = region;
		this.domain = domain;
	}

	public String getDomain() {
		return this.domain;
	}

	public String getRegion() {
		return this.region;
	}

	public String getRegionDomain() {
		return this.region + "." + this.domain;
	}

	public static Region fromRegionName(String regionName) {
		for (Region region : values()) {
			if (region.getRegion().equalsIgnoreCase(regionName)) {
				return region;
			}
		}
		throw new IllegalArgumentException("No Region found for RegionName:'" + regionName + "'");
	}
}