package com.mycompany.functionalinterface;

@FunctionalInterface // This annotation tells compiler to check the condition of single abstraction

public interface IamFunctionalInterface {

	void display(); // 1 abstract method allowed
	// void display1();

	static void staticFn1() {

	}

	default void defaultFn1() {

	}

	static void staticFn2() {

	}

	default void defaultFn2() {

	}
}