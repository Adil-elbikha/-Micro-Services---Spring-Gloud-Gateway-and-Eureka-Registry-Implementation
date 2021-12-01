package org.sid.billingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data

public class Customer {
    private Long id;
    private String name;
    private String email;

}