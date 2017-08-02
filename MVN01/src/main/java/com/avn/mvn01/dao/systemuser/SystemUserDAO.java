/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01.dao.systemuser;

import com.avn.mvn01.model.SystemUser;
import java.sql.SQLException;

/**
 *
 * @author stephen.silver
 */
public interface SystemUserDAO {
    public long save(final SystemUser systemUser) throws Exception;
}
