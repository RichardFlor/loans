package com.richard.loans.controller.dto;

import com.richard.loans.domain.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}
