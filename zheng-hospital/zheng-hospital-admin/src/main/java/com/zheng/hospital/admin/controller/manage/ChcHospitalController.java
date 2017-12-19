package com.zheng.hospital.admin.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;

import com.zheng.common.base.BaseController;
import com.zheng.common.validator.LengthValidator;
import com.zheng.hospital.dao.model.ChcHospital;
import com.zheng.hospital.dao.model.ChcHospitalExample;
import com.zheng.hospital.rpc.api.ChcHospitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文章控制器
 * Created by shuzheng on 2016/11/14.
 */
@Controller
@Api(value = "文章管理", description = "文章管理")
@RequestMapping("/manage/article")
public class ChcHospitalController extends BaseController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ChcHospitalController.class);
	
	@Autowired
	private ChcHospitalService chcHospitalService;



	@ApiOperation(value = "医院首页")
	@RequiresPermissions("cms:hospital:read")
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "/manage/hospital/index.jsp";
	}

	@ApiOperation(value = "医院列表")
	@RequiresPermissions("cms:hospital:read")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public Object list(
			@RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
			@RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
			@RequestParam(required = false, value = "sort") String sort,
			@RequestParam(required = false, value = "order") String order) {
		ChcHospitalExample chcHospitalExample = new ChcHospitalExample();
		if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
			chcHospitalExample.setOrderByClause(sort + " " + order);
		}
		List<ChcHospital> rows = chcHospitalService.selectByExampleForOffsetPage(chcHospitalExample, offset, limit);
		long total = chcHospitalService.countByExample(chcHospitalExample);
		Map<String, Object> result = new HashMap<>(2);
		result.put("rows", rows);
		result.put("total", total);
		return result;
	}


}