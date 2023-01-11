package com.ankita.patel.bbdashoops.ffinalKeyWord;

// "Final" keyword have different meaning based on the context.
// It can be used with classes, methods, variables and parameters. 

// Note 1: Final with class (refernce: SomeBaseClass.java)
//	If the class is final like string class, for example, you can't extend new types from it.
//  so if you want to close your class from extension, add final keyword. in some degree, this violates polymorphism principle.

// Note 2: Final with variable (reference : SampleClass.java)
//	Final variables can't be initialized with any value after they were declared.
//	it can be initialized in 1) place of declaration 2) constructor 3) initialization block

// Note 3: Final with parameter (reference : SampleClass.java)
// You will not able re-assign the value to "param".
// Considered to be good practice (same as const & in c++ for parameter).

// Note 4 : Final method (reference : SampleClass.java)
// Final key word can be used with a method in a case. When Method is final, It is can't be overridden.
// Hence, you can't use final and observe keywords together because they can't exist simultaneously.


public class LearnFinalKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
