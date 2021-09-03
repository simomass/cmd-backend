package it.cmd.backend.test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import it.cmd.backend.configurations.TestConfig;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ComponentScan(basePackages = { "it.cmd.backend.controllers", "it.cmd.backend.services",
		"it.cmd.backend.configuration" })
@TestPropertySource(properties = { "jdbc.driverClassName=org.h2.Driver", "jdbc.url=jdbc:h2:mem:myDb;DB_CLOSE_DELAY=-1",
		"spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect",
		"spring.jpa.hibernate.ddl-auto=update" })
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
@ContextConfiguration(classes = { TestConfig.class })
public abstract class AbstractTest {

	protected static final Logger log = LoggerFactory.getLogger(AbstractTest.class);
}
