package com.serviceImpl;

import org.springframework.stereotype.Service;

import com.DaoI.DaoI;
import com.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
	DaoI dao;

}
