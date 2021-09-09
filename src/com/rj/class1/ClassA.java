package com.rj.class1;

import com.rj.class2.Interface2;
import com.rj.class2.Interface3;
import com.rj.class2.Intrface1;

public class ClassA implements Intrface1,Interface2,Interface3
{

	@Override
	public void Meth3Add()
	{
	  System.out.println("Addition"+100+1);	
	}

	@Override
	public void Meth2Sub()
	{
		System.out.println("Sub"+(100-2));
	}

	@Override
	public void Meth1Mul()
	{
		System.out.println("Mul"+(100*2));
	}

}
