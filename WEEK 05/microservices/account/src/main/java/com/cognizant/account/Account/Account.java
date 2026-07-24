package com.cognizant.account.Account;


public record Account(
    String number,
    String type,
    double balance
) {}