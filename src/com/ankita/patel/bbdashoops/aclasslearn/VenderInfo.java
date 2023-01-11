package com.ankita.patel.bbdashoops.aclasslearn;

public class VenderInfo {
	private int vId;
	private String regId;

	
	public VenderInfo() {
	  
	}
	
	// Overloading of constructor
	// NOTE: If you want to overload constructor apart from default, we also need to
	// overload default constructor.
	public VenderInfo(int pVId, String pRegId) {
		vId = pVId;
		regId = pRegId;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		// With below code we can ensure that nobody will ever set the value of vId to zero or negative 
		// Always validate the input parameter of method.
		if (vId <= 0) {
			return;
		}
		this.vId = vId;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	@Override
	public String toString() {
		return "VenderInfo [vId=" + vId + ", regId=" + regId + "]";
	}

}
