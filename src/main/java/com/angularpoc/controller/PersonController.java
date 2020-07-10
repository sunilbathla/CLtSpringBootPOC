package com.angularpoc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularpoc.dao.BePrsnDAO;
import com.angularpoc.dto.BePrsnDto;
import com.angularpoc.model.BePrsnModel;
import com.angularpoc.model.ResponseModel;

@CrossOrigin(value="*")
@RestController
@RequestMapping(value="/person")
public class PersonController {
	
	@Autowired
	BePrsnDAO bePrsnDAO;
	
	@GetMapping("/getPersonData/{prsnId}")
	public ResponseModel getPrsnDetails(@PathVariable("prsnId") int prsnId) {
		Optional<BePrsnDto> bePrsnDto = bePrsnDAO.findById(prsnId);
		BePrsnModel bePrsnModel = new BePrsnModel(); 
		BeanUtils.copyProperties(bePrsnDto.get(), bePrsnModel);
		System.out.println("prsnId = " +prsnId);
		ResponseModel res = new ResponseModel();
		res.setStatus(HttpStatus.OK.value());
		res.setResult(bePrsnModel);
		return res;
	}
	
	@PostMapping("/addPersonDetails")
	public ResponseModel addPrsnDetails(@RequestBody BePrsnModel bePrsnModel) {
		BePrsnDto bePrsnDto = new BePrsnDto();
		ResponseModel res = new ResponseModel();
		bePrsnDto.setOptLckCtl(1);
		bePrsnDto.setRcdCrtNm("Sunil");
		bePrsnDto.setRcdCrtTs(new Date());
		bePrsnDto.setFstNm(bePrsnModel.getFstNm());
		bePrsnDto.setMidNm(bePrsnModel.getMidNm());
		bePrsnDto.setLastNm(bePrsnModel.getLastNm());
		bePrsnDto.setSexCd(bePrsnModel.getSexCd());
		bePrsnDto.setSsNr(bePrsnModel.getSsNr());
		bePrsnDto.setMrtlStatCd(bePrsnModel.getMrtlStatCd());
		bePrsnDto.setBrthDt(bePrsnModel.getBrthDt());
		bePrsnDto.setDsgtnCd("UKNW");
		bePrsnDto.setSfxCd("UKNW");
		bePrsnDto.setNbkId(0);
		bePrsnDto.setDeleteIn(Short.valueOf("0"));
		bePrsnDto = bePrsnDAO.save(bePrsnDto);
		//BeanUtils.copyProperties(bePrsnDto, bePrsnModel);
		res.setStatus(HttpStatus.OK.value());
		res.setResult("Person Details Saved Successfully.");
		return res;
	}
	
	@GetMapping(value = "/getAllPersons")
	
	public ResponseModel getAllPersons() {
		List<Integer> ids = new ArrayList<>();
		ids.add(Integer.valueOf(4558488));
		ids.add(Integer.valueOf(4558487));
		ids.add(Integer.valueOf(4558486));
		ids.add(Integer.valueOf(4558485));
								
		ids.add(Integer.valueOf(4558484));
		ids.add(Integer.valueOf(4558483));
		ids.add(Integer.valueOf(4558482));
		ids.add(Integer.valueOf(4558481));
		
		List<BePrsnDto> aoBePrsnDto = bePrsnDAO.findAllById(ids);
		List<BePrsnModel> aoBePrsnModel = new ArrayList<>(); 
		aoBePrsnDto.forEach(bePrsnDto -> {
			BePrsnModel bePrsnModel = new BePrsnModel ();
			bePrsnModel.setFstNm(bePrsnDto.getFstNm());
			bePrsnModel.setMidNm(bePrsnDto.getMidNm());
			bePrsnModel.setLastNm(bePrsnDto.getLastNm());
			bePrsnModel.setSexCd(bePrsnDto.getSexCd());
			bePrsnModel.setSsNr(bePrsnDto.getSsNr());
			bePrsnModel.setMrtlStatCd(bePrsnDto.getMrtlStatCd());
			bePrsnModel.setBrthDt(bePrsnDto.getBrthDt());
			aoBePrsnModel.add(bePrsnModel);
		});
		ResponseModel res = new ResponseModel();
		res.setStatus(HttpStatus.OK.value());
		System.out.println(aoBePrsnDto.size());
		res.setResult(aoBePrsnModel);
		return res;
	} 
}