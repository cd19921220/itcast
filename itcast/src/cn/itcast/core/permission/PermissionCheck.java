package cn.itcast.core.permission;

import cn.itcast.nsfw.user.entity.User;

public interface PermissionCheck {

	/**
	 * 判断用户是否有 code 对应的权限
	 * @param user 用户
	 * @param code 子系统的权限标识符
	 * @return true or false
	 */
	
	public boolean isAccessible(User user,String code);
}
