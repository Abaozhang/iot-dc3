/*
 * Copyright 2019 Pnoker. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pnoker.transfer.rtmp.feign;

import com.pnoker.common.base.BaseFeignApi;
import com.pnoker.security.FeignSecurityConfigurer;
import com.pnoker.transfer.rtmp.hystrix.RtmpFeignApiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Copyright(c) 2019. Pnoker All Rights Reserved.
 * <p>Author     : Pnoker
 * <p>Email      : pnokers@gmail.com
 * <p>Description:
 */
@RequestMapping("/rtmp")
@FeignClient(name = "DC3-DBS", fallbackFactory = RtmpFeignApiHystrix.class, configuration = FeignSecurityConfigurer.class)
public interface RtmpFeignApi extends BaseFeignApi {
}
