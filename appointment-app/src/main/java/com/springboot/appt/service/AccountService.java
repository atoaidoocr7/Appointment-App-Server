package com.springboot.appt.service;

import com.springboot.appt.entity.Owner;
import com.springboot.appt.payload.OwnerDto;

public interface AccountService {


    public OwnerDto createOwner(OwnerDto ownerDto);
    public OwnerDto updateOwner(OwnerDto ownerDto);
    public OwnerDto deleteOwner(OwnerDto ownerDto);

}
