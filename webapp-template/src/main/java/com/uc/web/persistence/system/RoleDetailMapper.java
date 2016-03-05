package com.uc.web.persistence.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uc.web.domain.system.Function;
import com.uc.web.domain.system.RoleDetail;
import com.uc.web.domain.system.example.RoleDetailExample;
import com.uc.web.forms.system.RoleQueryForm;
import com.uc.web.persistence.AppMapperBase;

public interface RoleDetailMapper extends AppMapperBase<RoleQueryForm, RoleDetail, RoleDetailExample> {
	List<? extends Function> selectRoleFunctions(String roleId);
	int insertRoleFunctions(
			@Param("roleId")
			String roleId,
			@Param("funcs")
			List<? extends Function> funcs);
}
