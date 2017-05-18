package cn.jack.executive.common.config;

import javax.sql.DataSource;

import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.spring4.BeetlSqlDataSource;
import org.beetl.sql.ext.spring4.BeetlSqlScannerConfigurer;
import org.beetl.sql.ext.spring4.SqlManagerFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * BeetlSql的配置
 * @author JackChen
 *
 */
@Configuration
public class BeetlSqlAutoConfiguration {
	 @Bean(name = "beetlSqlScannerConfigurer")
	    public BeetlSqlScannerConfigurer getBeetlSqlScannerConfigurer() {
	    	BeetlSqlScannerConfigurer conf = new BeetlSqlScannerConfigurer();
	    	conf.setBasePackage("cn.jack.executive.system.dao");
	    	conf.setDaoSuffix("Dao");
	    	conf.setSqlManagerFactoryBeanName("sqlManagerFactoryBean");
	    	return conf;
	    }
	    
	    @Bean(name = "sqlManagerFactoryBean")
	    @Primary
	    public SqlManagerFactoryBean getSqlManagerFactoryBean(@Qualifier("datasource") DataSource datasource) {
	    	SqlManagerFactoryBean factory = new SqlManagerFactoryBean();
	    	
	    	BeetlSqlDataSource  source = new BeetlSqlDataSource();
	    	source.setMasterSource(datasource);;
	    	factory.setCs(source);
	    	factory.setDbStyle(new MySqlStyle());
	    	factory.setInterceptors(new Interceptor[]{new DebugInterceptor()});
	    	factory.setNc(new UnderlinedNameConversion());
	    	factory.setSqlLoader(new ClasspathLoader("/sql"));
	    	return factory;
	    }
	    
	    @Bean(name="txManager")  
	    public DataSourceTransactionManager getDataSourceTransactionManager(@Qualifier("datasource") DataSource datasource) {  
	    	DataSourceTransactionManager dsm = new DataSourceTransactionManager();
	    	dsm.setDataSource(datasource);
	    	return dsm;
	    }  
}
