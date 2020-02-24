package com.api.assignment.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.api.assignment.util.CommonConstants;

/**
 * Neo4j Configuration
 * @author shekhar
 *
 */
@Configuration
@EnableNeo4jRepositories(basePackages = CommonConstants.NEO4J_BASE_PACKAGE)
@EnableTransactionManagement
public class Neo4jConfig {

	@Bean
    public SessionFactory sessionFactory() {
        return new SessionFactory(configuration(), CommonConstants.NODE_PACKAGE);
    }

    @Bean
    public org.neo4j.ogm.config.Configuration configuration() {
    	org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder()
    	.uri(CommonConstants.NEO4J_URI)
    	.credentials(CommonConstants.NEO4J_USER_ID, CommonConstants.NEO4J_PASSWORD)
    	.autoIndex(CommonConstants.NONE)
        .build();
    	return configuration;
    }

    @Bean
    public Neo4jTransactionManager transactionManager() {
        return new Neo4jTransactionManager(sessionFactory());
    }
}
