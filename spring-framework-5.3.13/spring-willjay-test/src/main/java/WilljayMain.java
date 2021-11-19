
import beans.SysUser;
import config.SysConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author lsc
 * <p> </p>
 */
public class WilljayMain {

	public static void main(String[] args) {
		// 获取容器
		ApplicationContext ac =new AnnotationConfigApplicationContext(SysConfig.class);
		// 获取 bean
		SysUser user = (SysUser) ac.getBean("sysUser");
		System.out.println("111");
		System.out.println(user.toString());
	}
}