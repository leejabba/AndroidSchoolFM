package com.heythisway.java.extend;

import java.util.ArrayList;

import com.heythisway.java.extend.city.Hospial;
import com.heythisway.java.extend.city.hospital.Doctor;
import com.heythisway.java.extend.city.hospital.Nurse;
import com.heythisway.java.extend.city.hospital.Patient;

public class ExtendMain {

	public static void main(String[] args) {
		
		// 병원을 하나 만들고
		Hospial hospital = new Hospial();
		hospital.doctor = 3;
		hospital.bed = 21;
		hospital.nurse = 6;
		
		// 의사를 3명 만들고
		Doctor doc[] = new Doctor[3];
		for(int i=0 ; i<3 ; i++){
			doc[i] = new Doctor();
			doc[i].setName("doc" + i);
			System.out.println(doc[i].getName());
		}
		
		// 간호사 6명 - 각각 다른 방향으로 한번씩 움직인다.
		Nurse nus[] = new Nurse[6];
		int direction = 1;
		
		for(int i=0 ; i<nus.length ; i++){
			nus[i] = new Nurse();
			switch(i%2){
			case 0 :
				nus[i].move("오른쪽");
				break;
			case 1 :
				nus[i].move("왼쪽");
				break;
			}
			direction = direction + 1;
		}
		
		
		// 환자 21명
		Patient temp = new Patient();
		String name = new String();
		
		ArrayList<Patient> patient = new ArrayList<Patient>();
		for(int i=0 ; i<21 ; i++){
			patient.add(new Patient());
			
			name = i + 1 + "번째 환자";
			temp = patient.get(i);
			
			temp.setName(name);
			System.out.println(temp.getName());
		}
		
		/*
		Patient[] patient = new Patient[21];
		for(int i=0 ; i<patient.length ; i++){
			patient[i] = new Patient();
		}
		*/
		
		// 각의사가 환자를 7명씩 진찰하는 프로그램을 작성하자.
		

	}

}
