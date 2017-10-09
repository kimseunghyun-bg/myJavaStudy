package com.kimseunghyun.ejb;

import com.kimseunghyun.ejb.business.FooEJB;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.transaction.UserTransaction;
import java.util.Hashtable;

public class EJBClient {

	// ** 반드시 throws Exception을 하면 Foo 메소드를 호출하는 곳에서 트랜잭션이 가능하다.
	public void Foo() throws Exception {
		// EJB Connection
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		env.put(Context.SECURITY_PRINCIPAL, "weblogic10"); // id
		env.put(Context.SECURITY_CREDENTIALS, "weblogic10"); // pwd
		env.put(Context.PROVIDER_URL, "t3://115.94.204.155:7003"); // remote server address
		Context ctx = new InitialContext(env);
		UserTransaction ut = (UserTransaction) ctx.lookup("javax.transaction.UserTransaction");

		// Call remote
		// ctx.lookup( " deployed remote name # interface full path), It should get from remote server
		FooEJB fooEJB = (FooEJB)ctx.lookup("CallFooEJB#com.kimseunghyun.ejb.FooEJB");

		try {
			ut.begin(); // if use transaction
			fooEJB.bar();
			ut.commit();
		} catch (Exception e) {
			ut.rollback();
			throw e;
		}
	}
}
