package com.projeto.guarato.projetoguarato.init;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.projeto.guarato.projetoguarato.repository")
public class JPAConfig {

    @Bean
    public DataSource dataSource(){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/projetoguarato");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("root");
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");

        return basicDataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");

        return adapter;
    }

    @Bean
    public EntityManagerFactory entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource);
        factory.setJpaVendorAdapter(jpaVendorAdapter);
        factory.setPackagesToScan("com.projeto.guarato.projetoguarato.model");
        factory.afterPropertiesSet();

        return factory.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);

        return transactionManager;
    }
}
