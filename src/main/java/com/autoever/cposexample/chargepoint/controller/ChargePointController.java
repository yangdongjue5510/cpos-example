package com.autoever.cposexample.chargepoint.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.autoever.cposexample.chargepoint.service.ChargePointService;
import com.autoever.cposexample.chargepoint.service.dto.request.AddChargePointRequest;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ChargePointController {

	private final ChargePointService chargePointService;

	public ResponseEntity<?> addChargePoint(@RequestBody final AddChargePointRequest chargePointRequest) {
		chargePointService.addChargePoint(chargePointRequest);
		return ResponseEntity.noContent().build();
	}
}
