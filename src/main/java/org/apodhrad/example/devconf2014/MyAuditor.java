package org.apodhrad.example.devconf2014;

import javax.inject.Named;

import org.apache.camel.Exchange;
import org.switchyard.bus.camel.audit.Auditor;
import org.switchyard.bus.camel.processors.Processors;

@Named("MyAuditor")
public class MyAuditor implements Auditor {

	@Override
	public void afterCall(Processors processor, Exchange exchange) {
		System.out.println("[AUDITOR] proccessor: " + processor + ", message: "
				+ exchange.getIn().getBody());
	}

	@Override
	public void beforeCall(Processors processor, Exchange exchange) {
		System.out.println("[AUDITOR] proccessor: " + processor + ", message: "
				+ exchange.getIn().getBody());
	}

}
