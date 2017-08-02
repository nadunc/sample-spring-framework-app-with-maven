/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01.dao.systemuser;

import com.avn.mvn01.model.SystemUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @Author stephen.silver
 * @Document SystemUserDAOImpl
 * @Created on 02/08/2017, 2:42:48 PM
 *
 */

@Repository("systemUserDAO")
public class SystemUserDAOImpl implements SystemUserDAO {

    @Autowired
    private DataSource dataSource;

    @Override
    public long save(final SystemUser systemUser) throws Exception {

        final String SQL = "INSERT INTO SYSTEM_USER (employee_id, user_role_id, status) values (?, ?, ?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        new JdbcTemplate(dataSource).update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps = connection.prepareStatement(SQL, new String[]{"id"});
                        ps.setLong(1, systemUser.getEmployeeId());
                        ps.setLong(2, systemUser.getUserRoleId());
                        ps.setInt(3, systemUser.getStatus());

                        return ps;
                    }
                }, keyHolder);

        return keyHolder.getKey().longValue();

    }

}
