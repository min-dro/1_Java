package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;

public class FarmController {
	// 필드부
	// Map<K, V> => K: 키 값, V: 데이터 값
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	// ArrayList
	private ArrayList<Farm> list = new ArrayList<>();	// 농산물 구매 데이터
	
	// 메소드부
	public boolean addNewKind(Farm f, int amount) {
		if(!hMap.containsKey(f)) { // containsKey(키값) : 해당 키값이 Map에 존재하는 지 체크
			// hMap 내에 f에 해당하는 키 값이 없을 경우
			//	hMap에 데이터 추가
			hMap.put(f, amount);
			return true;
		}
		
		// if문을 들어가지 못한 경우 hMap 내에 f에 해당하는 키가 있을 경우 (데이터 있음)
		return false;
	}
	public boolean removeKind(Farm f) {
		if(hMap.containsKey(f)) {
			// hMap 내에 f에 해당하는 키 값아 존재하는 경우 데이터 삭제
			hMap.remove(f);
			return true;
		}
		
		// hMap 내에 f에 해당하는 키 값이 존재하지 않을 경우
		return false;
	}
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			// hMap 내에 f에 해당하는 키 값이 존재하는 경우
			// 	* Map 데이터 추가 시 같은 키 값이 있는 경우 해당 데이터를 덮어씌움.
			hMap.put(f, amount);
			return true;
		}
		// hMap 내에 f에 해당하는 키 값이 존재하지 않는 경우
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm(){
		return hMap;	
	}
	
	public boolean buyFarm(Farm f) {
		int amount = hMap.get(f);		// Wrapper class : hMap.get(f)
										// 오토 언박싱 : Integer -> int
										// 오토 박싱  : int -> Integer
		if(hMap.containsKey(f)			// 전달받은 f가 hMap 안에 존재하는 지
				&& hMap.get(f) >= 0) {	// f의 수량 -> hMap 내에서 value를 의미
										// f(key)에 해당하는 value의 값이 0 이상인 지
			list.add(f);				// list에 데이터 추가(f)
			hMap.put(f, amount-1);		// hMap에 f의 수량 1감소 => 1 감소 후 다시 저장
			return true;
		}
		
		return false;	
	}
	
	public boolean removeFarm(Farm f) {
		if(list.contains(f)) {
			// list에 f에 대한 데이터가 존재하는 경우
			list.remove(f);				// 리스트에서 해당 데이터(f) 제거
			
			int amount = hMap.get(f);	// Map에서 수량 1 증가
			hMap.put(f, amount+1);
			return true;
		}
		
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm(){
		return list;
	}
}
