package com.cwc.mask.data.entity;


import com.cwc.mask.data.utility.MaskData;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    private long id;

    private String name;

    @MaskData
    private String phoneNumber;

    @MaskData
    private String clubCardNumber;
}
