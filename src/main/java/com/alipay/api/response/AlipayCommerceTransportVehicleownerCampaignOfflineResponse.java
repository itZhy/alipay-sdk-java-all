package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaign.offline response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-25 17:00:05
 */
public class AlipayCommerceTransportVehicleownerCampaignOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 2673561133871931729L;

	/** 
	 * 状态。P(审核中)、S(审核通过)、F(审核驳回)、I(初始状态)
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}