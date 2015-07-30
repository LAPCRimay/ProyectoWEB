package test.ciclovida1;

import javax.faces.bean.ManagedBean;



@ManagedBean(name="blc")
public class BsicLifeCycle {
	private int i;

	public int getI() {
		System.out.println("--> geti");
		return i;
	}

	public void setI(int i) {
		System.out.println("--> seti");
		this.i = i;
	}
	
	public String process(){
		System.out.println("--> process");
		this.i=-1;
		return null;
	}
}
