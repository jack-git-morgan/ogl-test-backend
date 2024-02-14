/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ogl.devtest.customer;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 *
 * @author jackw
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
