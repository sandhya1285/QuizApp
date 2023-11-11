package com.Sandhya.Questions;

import java.util.*;

public class QuestionPrep {
	static List<Question> easy=new ArrayList<Question>();
	static List<Question> medium = new ArrayList<Question>();
	static List<Question> hard=new ArrayList<Question>();
	static{
        easy.add(new Question(1,"In Java default real number is?",
                "a) float", "b) int", "c) double", "d) long", "c"));
        easy.add(new Question(
                2,"What is the ASCII code of G in Java?",
                "a) 65", "b) 75", "c) 61", "d) 71", "d"));
        easy.add(new Question(
                3,"In Java float number should prefix with f?",
                "a) true", "b) false", "", "", "a"));
        easy.add(new Question(
                4,"What is the correct option for method naming in Java?",
                "a) 1methodName", "b) _1methodName&", "c) _methodName$",
                "d) MethodName", "c"));
        easy.add(new Question(
                5,"Identify Relational Operators in Java?",
                "a) ><", "b) &&", "c) +-", "d) ?:", "a"));
        easy.add(new Question(
                6,"If condition is true or not on which loop at least one time body will execute?",
                "a) for", "b) while", "c) do while", "d) for-each", "c"));
        easy.add(new Question(
                7,"What are the variables which are declared at class level?",
                "a) local", "b) static", "c) instance", "d) method", "c"));
        easy.add(new Question(
                8,"Which of the variables memory allocated in stack",
                "a) static", "b) instance", "c) method", "d) none of the above", "a"));
        easy.add(new Question(
                9,"Who's job is to collect reference less objects in heap memory",
                "a) collectors", "b) memory refresh", "c) garbage collector",
                "d) garbage refresh", "c"));
        easy.add(new Question(10,"Which operator is used to create Object?",
                "a) new", "b) create", "c) object", "d) init", "a"));
		medium.add(new Question(
                1,"What is the OOPS concept used for setting and getting data?",
                "a) Abstraction", "b) Encapsulation", "c) polymorphism", "d) inheritance",
                "b"));
		medium.add(new Question(
                2,"Which of the Variables/methods can call with out reference of Object",
                "a) method", "b) local", "c) instance", "d) static", "d"));
		medium.add(new Question(3,"Example of Compile Time Polymorphism?",
                "a) Method Overloading", "b) Method Overriding", "c) Method Overridden",
                "d) Method Overloaded", "a"));
		medium.add(new Question(
                4,"When ever Object is created by default which Constructor will get invoked?",
                "a) Parameterized", "b) private", "c) default", "d) public", "c"));
		medium.add(new Question(
                5,"More than one Constructor with same name and different parameters is called?",
                "a) constructor overloading", "b) constructor Overriding",
                "c) constructor Overridden", "d) constructor Overloaded", "a"));
		medium.add(new Question(
                6,"Which method will use to call parent class Constructor",
                "a) this()", "b) parent()", "c) super()", "d) new()", "c"));
		medium.add(new Question(
                7,"Which inheritance type is not supported by Java?",
                "a) single level", "b) hybrid", "c) multi level", "d) multiple", "d"));
		medium.add(new Question(
                8,"Which keyword is used to achieve Inheritance? ",
                "a) extends", "b) implements", "c) throwed", "d) invoked", "a"));
		medium.add(new Question(
                9,"Is String literal memory will store in?",
                "a) heap", "b) stack", "c) string constant pool", "d) registry", "c"));
		medium.add(new Question(
                10,"Which of the following doesn't participate in Inheritance?",
                "a) public variables", "b) constructor", "c) methods", "d) constants", "b"));
		 hard.add(new Question(
	                1,"Methods which are present in child class and not available in parent class is called?",
	                "a) overridden", "b) inherited", "c) specialized", "d) overloaded", "c"));
		 hard.add(new Question(
	                2,"which variables can access from out side of package and if only have parent child relationship?",
	                "a) public", "b) private", "c) default", "d) protected", "d"));
		 hard.add(new Question(
	                3,"How can we achieve 100% abstraction?",
	                "a) interfaces", "b) abstract class", "c) lambda expression",
	                "d) streams", "a"));
		 hard.add(new Question(
	                4,"Which of the following is used to initiate Abstract class?",
	                "a) inner class", "b) initialization block", "c) Anonymous class",
	                "d) static block", "c"));
		 hard.add(new Question(
	                5,"Storing application state is called?",
	                "a) serialization", "b) deserialization", "c) serializable",
	                "d) deserializable", "a"));
		 hard.add(new Question(
	                6,"How many objects created when we initialized string with new keyword?",
	                "a) 1", "b) 3", "c) 2", "d) 4", "c"));
		 hard.add(new Question(
	                7,"Which stage is not present in class loader subsystem?",
	                "a) running", "b) linking", "c) initialization", "d) loading", "a"));
		 hard.add(new Question(
	                8,"Diamond problem can be resolved by using?",
	                "a) interface", "b) abstract class", "c) inner class",
	                "d) static block", "a"));
		 hard.add(new Question(
	                9,"Which of the block will execute before constructor executing?",
	                "a) inner class", "b) abstract class", "c) initialization block",
	                "d) Anonymous class", "c"));
		 hard.add(new Question(
	                10,"Which methods included in interfaces in java8 version?",
	                "a) default", "b) static", "c) concrete", "d) abstract", "a"));
		 }
	public void addEasy(Question q) {
		easy.add(q);
	}
	public void addMedium(Question q) {
		medium.add(q);
		
	}
	public void addHard(Question q) {
		hard.add(q);
	}
	public Question getEasy(int id) {
		Question q=null;
		if(id<easy.size()){
			q=easy.get(id-1);
		}
		return q;
	}
	public Question getMedium(int id) {
		Question q=null;
		if(id<medium.size()){
			q=medium.get(id-1);
		}
		return q;
	}
	public Question getHard(int id) {
		Question q=null;
		if(id<hard.size()){
			q=hard.get(id-1);
		}
		return q;
	}
	public String deleteEasy(int id) {
		String res="";
    	if(id<easy.size()) {
    	easy.remove(id);
    	res = "Deleted successfully from easy questions";
    	}
    	else {
    		res="Please give the correct id";
    	}
    	return res;
		
	}
	public String deleteMedium(int id) {
		String res="";
    	if(id<medium.size()) {
    	medium.remove(id);
    	res = "Deleted successfully from medium questions";
    	}
    	else {
    		res="Please give the correct id";
    	}
    	return res;
		
	}
	public String deleteHard(int id) {
		String res="";
    	if(id<hard.size()) {
    	hard.remove(id);
    	res = "Deleted successfully from hard questions";
    	}
    	else {
    		res="Please give the correct id";
    	}
    	return res;
		
	}
	 public int getEasySize() {
	    return easy.size();
	 }
	 public int getMediumSize() {
	    return medium.size();
	 }
	 public int getHardSize() {
	    return hard.size();
	 }

}
