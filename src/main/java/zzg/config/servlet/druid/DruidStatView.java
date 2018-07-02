package zzg.config.servlet.druid;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by zhangzhenguo
 * on 2018/6/29
 * info:
 */
@WebServlet(urlPatterns = "/druid/*",
        initParams={
                //@WebInitParam(name="allow",value="47.97.110.31,127.0.0.1"),// IP白名单 (没有配置或者为空，则允许所有访问)
               // @WebInitParam(name="deny",value="192.168.16.111"),// IP黑名单 deny优先于allow，如果在deny列表中，就算在allow列表中，也会被拒绝。
                @WebInitParam(name="loginUsername",value="admin"),// 监控页面访问的用户名
                @WebInitParam(name="loginPassword",value="123456"),// 监控页面访问的密码
                @WebInitParam(name="resetEnable",value="true")// 禁用HTML页面上的“Reset All”功能
        })
public class DruidStatView extends StatViewServlet {
}
