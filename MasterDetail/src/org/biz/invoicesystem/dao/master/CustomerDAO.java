/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.biz.invoicesystem.dao.master;

import org.biz.dao.service.GenericDAO;
import org.biz.invoicesystem.entity.master.Customer;

/**
 *
 * @author mjawath
 */
public class CustomerDAO extends GenericDAO<Customer>{

    
    public CustomerDAO() {
    setCls(Customer.class);
    }


}
