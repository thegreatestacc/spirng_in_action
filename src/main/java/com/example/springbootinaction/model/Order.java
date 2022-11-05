package com.example.springbootinaction.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {
    @NotBlank(message = "Name required.")
    String name;
    @NotBlank(message = "Street required.")
    String street;
    @NotBlank(message = "City required.")
    String city;
    @NotBlank(message = "State required.")
    String state;
    @NotBlank(message = "Zip required.")
    String zip;
    @CreditCardNumber(message = "Not a valid credit card number.")
    String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])(\\/)([1-9][0-9])$", message = "Must be formatted MM/YY.")
    String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV.")
    String ccCVV;
}
