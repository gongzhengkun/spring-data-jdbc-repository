package org.springframework.data.jdbc.postgresql;

import org.springframework.data.jdbc.AbstractJdbcRepositoryManualKeyTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.springframework.data.jdbc.postgresql.AbstractJdbcRepositoryTestPostgresqlConfig.POSTGRESQL_PORT;

/**
 * @author Tomasz Nurkiewicz
 * @since 1/9/13, 10:19 PM
 */
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = AbstractJdbcRepositoryTestPostgresqlConfig.class)
public class AbstractJdbcRepositoryManualKeyPostgresqlTest extends AbstractJdbcRepositoryManualKeyTest {

	public AbstractJdbcRepositoryManualKeyPostgresqlTest() {
		super(POSTGRESQL_PORT);
	}

}
