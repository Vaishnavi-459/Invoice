package com.dev.invoice.rest.util;

import org.springframework.stereotype.Component;

import com.dev.invoice.rest.entity.Invoice;

import lombok.var;

@Component
public class InvoiceUtil {

	public Invoice CalculateFinalAmountIncludingGST(Invoice inv) {
		Double amount = inv.getAmount();
		double gst = 0.1;
		double finalAmount = amount + (amount * gst);
		inv.setFinalAmount(finalAmount);
		return inv;
	}

	public void copyNonNullValues(Invoice req, Invoice db) {

		if (req.getName() != null) {
			db.setName(req.getName());
		}

		if (req.getAmount() != null) {
			db.setAmount(req.getAmount());
		}

		if (req.getNumber() != null) {
			db.setNumber(req.getNumber());
		}

		if (req.getReceivedDate() != null) {
			db.setReceivedDate(req.getReceivedDate());
		}

		if (req.getType() != null) {
			db.setType(req.getType());
		}

		if (req.getVendor() != null) {
			db.setVendor(req.getVendor());
		}

		if (req.getComments() != null) {
			db.setComments(req.getComments());
		}
	}
}
