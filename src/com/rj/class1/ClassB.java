package com.rj.class1;

import com.rj.class2.Interface2;
import com.rj.class2.Interface3;
import com.rj.class2.Intrface1;

public abstract class ClassB implements Intrface1,Interface2,Interface3
{

    public static void main(String[] args)
    {
	   Intrface1 a1=new ClassA();
	   a1.Meth1Mul();
	   
	   Interface2 a2=new ClassA();
	   a2.Meth2Sub();
	   
	   Interface3 a3=new ClassA();
	   a3.Meth3Add();
	}
}
