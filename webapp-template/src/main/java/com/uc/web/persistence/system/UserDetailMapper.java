package com.uc.web.persistence.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uc.web.domain.system.Role;
import com.uc.web.domain.system.RoleDetail;
import com.uc.web.domain.system.UserDetail;
import com.uc.web.domain.system.example.UserDetailExample;
import com.uc.web.forms.system.UserQueryForm;
import com.uc.web.persistence.AppMapperBase;

public interface UserDetailMapper extends AppMapperBase<UserQueryForm, UserDetail, UserDetailExample> {
	int insetUserRoles(
			@Param("userId")
			String userId,
			@Param("roles")
			List<? extends Role> roles);

	List<RoleDetail> selectUserRoles(String userId);
}
