package com.autoever.cposexample.chargepoint.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autoever.cposexample.chargepoint.domain.ChargePoint;
import com.autoever.cposexample.chargepoint.repository.ChargePointRepository;
import com.autoever.cposexample.chargepoint.service.dto.request.AddChargePointRequest;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ChargePointService {

	private final ChargePointRepository chargePointRepository;

	public void addChargePoint(final AddChargePointRequest request) {
		final ChargePoint chargePoint = ChargePoint.builder()
			.name(request.getName())
			.build();
		chargePointRepository.save(chargePoint);
	}
}
