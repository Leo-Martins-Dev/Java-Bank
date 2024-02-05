package org.javabank.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardHolder {
        private byte numberCard;
        private byte pin;
        private String firstName;
        private String lastName;
        private long amount;
}
