package com.uucoding.gof23.structural.facade;

/**
 * 用户信息外观
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/22  00:00
 */
public class UserInfoController {

    private UserService userService = new UserService();
    private RoleService roleService = new RoleService();
    private PermissionService permissionService = new PermissionService();

    /**
     * 对客户端暴露的获取用户信息的接口
     *
     * @return
     */
    public void getUserInfo() {
        userService.getUser();
        roleService.getRoleList();
        permissionService.getPermissionList();
        System.out.println("获取用户信息成功");
    }
}
