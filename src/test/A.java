package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {
	private int a=15;
	private Integer aInteger=new Integer(5);
	private float floatA=31415926L;
	private double gdouble=100;
	private long llong=400;
	private short mshort=150;
	private char nchar='c';
	private byte obyte=21;
	private boolean pboolean=false;
	char kk='k';
	int cyc=50;
	public A(){
	}
	double toDouble(Object obj){
		return System.identityHashCode(aInteger);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.
		append("Bean  :").
		append("A [a=").append(System.identityHashCode(a)).append("\t\t").
		append("aInteger=").append(System.identityHashCode(aInteger)).append("\t\t").
		append("floatA=").append(floatA).append("\t\t").
		append("gdouble=").append(gdouble).append("\t\t").
		append("llong=").append(llong).append("\t\t").
		append("mshort=").append(mshort).append("\t\t").
		append("nchar=").append(System.identityHashCode(nchar)).append("\t\t").
		append("obyte=").append(System.identityHashCode(obyte)).append("\t\t").
		append("pboolean=").append(System.identityHashCode(pboolean)).append("\t\t").
		append("kk=").append(System.identityHashCode(kk)).append("\t\t").
		append("cyc=").append(System.identityHashCode(cyc)).append("\t\t").
		append("");
		return builder.toString();
	}
	
}
