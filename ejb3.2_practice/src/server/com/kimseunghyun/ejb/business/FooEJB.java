package com.kimseunghyun.ejb.business;

import javax.ejb.Remote;

/**
 * Created by kimseunghyun on 2017-10-09.
 */
@Remote
public interface FooEJB {
    void bar();
}
