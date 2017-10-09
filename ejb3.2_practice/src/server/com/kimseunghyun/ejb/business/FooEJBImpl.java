package com.kimseunghyun.ejb.business;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by kimseunghyun on 2017-10-09.
 */
@Remote(FooEJB.class)
@Stateless(mappedName = "CallFooEJB")
public class FooEJBImpl implements FooEJB {

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void bar() {
        System.out.println("Bar");
    }
}
