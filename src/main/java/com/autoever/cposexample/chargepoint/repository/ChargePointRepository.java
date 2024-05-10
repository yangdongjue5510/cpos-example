package com.autoever.cposexample.chargepoint.repository;

import org.springframework.data.repository.Repository;

import com.autoever.cposexample.chargepoint.domain.ChargePoint;

public interface ChargePointRepository extends Repository<Long, ChargePoint> {
	ChargePoint save(ChargePoint chargePoint);
}
