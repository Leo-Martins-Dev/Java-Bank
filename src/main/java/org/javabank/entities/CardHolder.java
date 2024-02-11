package org.javabank.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardHolder {
        private long numberCard;
        private short pin;
        private String firstName;
        private String lastName;
        private double amount;
}
