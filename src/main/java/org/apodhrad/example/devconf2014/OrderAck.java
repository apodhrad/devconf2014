package org.apodhrad.example.devconf2014;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderAck {

	private String status;
	private double prize;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "[ORDER] status: " + status + ", prize: " + prize;
	}

}
