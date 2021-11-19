package config;


import beans.SysUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lsc
 * <p> </p>
 */
@Configuration
public class SysConfig {

	@Bean
	public SysUser sysUser(){
		return new SysUser("zszxz","123");
	}
}
