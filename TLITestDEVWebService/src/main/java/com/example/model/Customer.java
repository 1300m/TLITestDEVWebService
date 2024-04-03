package com.example.model;

public class Customer {
	private String insureName;
	private String[] policy = new String[3];
	private String policyNo;
	private String policyType;
	private String status;
	private String agentId;
	
	public Customer(String insureName, String policyNo, String policyType, String status,
			String agentId) {
		super();
		this.insureName = insureName;
		this.policy[0] = policyNo;
		this.policy[1] = status;
		this.policy[2] = agentId;
		this.policyNo = policyNo;
		this.policyType = policyType;
		this.status = status;
		this.agentId = agentId;
	}

	public String getInsureName() {
		return insureName;
	}
	
	public void setInsureName(String insureName) {
		this.insureName = insureName;
	}
	
	public String[] getPolicy() {
		return policy;
	}
	
	public void setPolicy(String[] policy) {
		this.policy = policy;
	}
	
	public String getPolicyNo() {
		return policyNo;
	}
	
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	
	public String getPolicyType() {
		return policyType;
	}
	
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getAgentId() {
		return agentId;
	}
	
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
}
