package com.biz.classesx;

import com.biz.classesx.parents.AnimalClass;
import com.biz.classex.childeren.CatClass;
import com.biz.classex.childeren.DogClass;

public class ClassExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogClass dog = new DogClass();
		CatClass cat =new CatClass();
		
		dog.strName = "몽탱이";
		dog.whatIsName();
		
		dog.strColor = "화이트";
		dog.whatIsColor();
		
		cat.strName = "나비";
		cat.whatIsName();
		
		AnimalClass animalClass = new AnimalClass();
		animalClass.strName = "포유류 동물";
		animalClass.whatIsName();
	

	}

}
