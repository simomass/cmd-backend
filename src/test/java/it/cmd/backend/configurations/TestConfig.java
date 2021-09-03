package it.cmd.backend.configurations;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import it.cmd.backend.services.GeometryService;
import it.cmd.backend.services.implementations.GeometryServiceImpl;

@Configuration
@EnableJpaRepositories(basePackages = "it.cmd.backend.repository")
@EnableTransactionManagement
public class TestConfig {

	@Bean
	public DataSource dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2).addScript("db/create-db.sql").build();
		return db;
	}

//  
//    @Bean(name="entityManagerFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//
//        return sessionFactory;
//	}

	@Bean
	public GeometryService geometryService() {
		return new GeometryServiceImpl();
	}
//
//	@Bean
//    public GeometryRepository geometryRepository() {
//    	return new GeometryRepository();
//    }
//
//	@Bean
//    public EntityManager entityManager() {
//		return new EntityManagerFactoryBuilder(jpaVendorAdapter, jpaProperties, persistenceUnitManager)
//				
////				createEntityManager();
//	}
    
}
