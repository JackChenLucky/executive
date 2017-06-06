package cn.jack.executive.common.autocode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.ConnectionSource;
import org.beetl.sql.core.ConnectionSourceHelper;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.SQLLoader;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.gen.GenConfig;

public class BuildCode {

	public static void main(String[] args) {
		ConnectionSource source = ConnectionSourceHelper.getSimple(
				"com.mysql.jdbc.Driver",
				"jdbc:mysql://localhost:3306/test?useSSL=true",
				"root",
				"root");
		DBStyle mysql = new MySqlStyle();
		// sql语句放在classpagth的/sql 目录下
		SQLLoader loader = new ClasspathLoader("/sql");
		// 数据库命名跟java命名一样，所以采用DefaultNameConversion，还有一个是UnderlinedNameConversion，下划线风格的，
		UnderlinedNameConversion nc = new  UnderlinedNameConversion();
		// 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
		SQLManager sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});
		
		
		try {
			sqlManager.genPojoCodeToConsole("Sys_Menu");
			sqlManager.genSQLTemplateToConsole("Sys_Menu");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		// 或者直接生成java文件
		GenConfig config = new GenConfig();
		config.preferBigDecimal(true);
		try {
			sqlManager.genPojoCode("Sys_User","cn.jack.executive.system.model",config);
			sqlManager.genSQLFile("Sys_User");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("生成完毕");
	}
}
